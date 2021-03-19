import matplotlib.pyplot as plt
import pandas as pd
import numpy as np

# Month dictionary to group columns by first two characters into the correct month brackets
month = {
    "01": "January",
    "02": "February",
    "03": "March",
    "04": "April",
    "05": "May",
    "06": "June",
    "07": "July",
    "08": "August",
    "09": "September",
    "10": "October",
    "11": "November",
    "12": "December"
}


# Returns the month the column header falls into. The first column doesn't fit the mold and will be renamed to "Year"
def get_month(column):
    return month[column[:2]] if column[:2] in month else "Year"

def plot_regression(filename):
    df = pd.read_csv(filename)

    # Groups the columns using the get_month function and aggregates by the mean
    df = df.groupby(get_month, axis=1).mean()
    
    x = df['Year']
    y1 = df['March']
    y2 = df['September']


    # Calculates the slope and y-intercept of the best-fit lines for y1 and y2
    m1, b1 = np.polyfit(x, y1, 1)
    m2, b2 = np.polyfit(x, y2, 1)

    # Adds the anomalies to the dataframe
    df['March Anomalies'] = df['March'] - (m1 * df['Year'] + b1)
    df['September Anomalies'] = df['September'] - (m2 * df['Year'] + b2)
    
    # Plots the two scatterplots and regression lines
    plt.plot(x, y1, 'yo', label="March")
    plt.plot(x, m1 * x + b1, '--k', label="March Best-Fit")
    plt.plot(x, y2, 'go', label="September")
    plt.plot(x, m2 * x + b2, '--b', label="September Best-Fit")
    
    # Displays the Plot and creates a Legend
    plt.legend()
    plt.show()


# Runs plot_regression. Change the file path and filename accordingly
filename = './Nicholas/data/data_79_20.csv'
plot_regression(filename)

