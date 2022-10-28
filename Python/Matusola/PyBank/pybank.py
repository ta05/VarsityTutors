import numpy as np
import pandas as pd

def main():
    infile = open("./data/budget_data.csv", "r")
    header = infile.readline().split(",")
    data = []

    # Write the .csv to data list by line
    for line in infile.read().splitlines():
        row = line.split(",")
        data.append(row)
    
    infile.close()
    
    # Can't assign separate datatypes for each column using numpy
    # Initialize the data and Month-Over-Month as dataframes, assign the profits column as integers and convert to numpy array
    data = pd.DataFrame(data, columns=header).astype(dtype={header[1]: 'int'}).to_numpy()
    MoM = pd.DataFrame([[data[i-1][0], data[i][1] - data[i-1][1]] for i in range(1, len(data))], columns=[header[0], 'Profits/Losses Change']).astype(dtype={'Profits/Losses Change': 'int'}).to_numpy()

    # Create the lines to print and write to the txt file
    lines = []
    lines.append("Financial Analysis")
    lines.append("----------------------------")
    lines.append(f"Total Months: {len(data)}")
    lines.append(f"Total: ${np.sum(data[:, 1]):,}")
    lines.append(f"Average Change: ${round(np.mean(MoM[:, 1]), 2):,}")
    lines.append(f"Greatest Increase in Profits: {MoM[np.argmax(MoM[:,1])][0]} (${max(MoM[:,1]):,})")
    lines.append(f"Greatest Decrease in Profits: {MoM[np.argmin(MoM[:,1])][0]} (${min(MoM[:,1]):,})")

    outfile = open("./output/summary.txt", "w")

    # Write lines to txt file and print to terminal
    for line in lines:
        outfile.write(line + "\n")
        print(line)

    outfile.close()

if __name__ == "__main__":
    main()