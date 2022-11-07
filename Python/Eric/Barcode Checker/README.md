# Barcode Checker

# Task

A barcode is valid if the digits satisfy a certain constraint. For example, take the 13-digit barcode `1877455846014` and split the first 12 digits into two groups: `(1, 7, 4, 5, 4, 0)` and `(8, 7, 5, 8, 6, 1)`. The first group contains every other digit starting with the first, and the second group contains every other digit starting with the second. Take the sum of the digits in the second group, and multiply it by 3. Add to that the sum of the digits in the first group. Subtract the last digit of that number from 10, and it should match the last digit of the barcode.

Example math using barcode `1877455846014`:
Sum of first group = 1 + 7 + 4 + 5 + 4 + 0 = **21**
Sum of second group = 8 + 7 + 5 + 8 + 6 + 1 = **35**
Multiply second group by 3 = **35** x 3 = 105
Add first group = 105 + **21** = 12**6**
Use the last digit and subtract from ten = 10 - **6** = **4**
4 is the last digit in the barcode, so it is valid

Write a program named `barcode_checker.py` that takes as input a filename that contains many 13-digit barcodes. Have your program read the file, determine whether each barcode is valid, and write the valid barcodes to a new file named `valid_barcodes.txt`. Have your program output the total number of valid barcodes found using the example output.

Example output using **`barcodes.txt`**:

~~~py
Enter the name of the file: barcodes.txt
There are ?? valid barcodes
~~~