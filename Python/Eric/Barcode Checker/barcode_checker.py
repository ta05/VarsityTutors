import os

def is_valid(barcode):
    odd_digits = barcode[0:12:2]
    even_digits = barcode[1:12:2]

    odd_sum = sum([int(digit) for digit in odd_digits])
    even_sum = sum([int(digit) for digit in even_digits])

    return 10 - (even_sum * 3 + odd_sum) % 10 == int(barcode[-1])


def main():
    filename = input("Enter the name of the file: ")

    with open(os.path.join("./data", filename), "r") as infile:
        barcodes = infile.read().splitlines()
    
    with open("./output/valid_barcodes.txt", "w") as outfile:
        total_valid = 0
        for barcode in barcodes:
            if is_valid(barcode):
                total_valid += 1
                outfile.write(barcode + "\n")
        print(f"There are {total_valid} valid barcodes.")


if __name__ == "__main__":
    main()
