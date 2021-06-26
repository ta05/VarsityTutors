# Homework 3

## Print Format

Write a function which accepts a list of strings where each string contains a name of the seller, a cost of the item and the number of that item sold each separated by semicolons and prints out each item in the list in the following format:  

Name    Amount  Items   Total

where Name is the name shortened to 4 characters, the amount rounded to the nearest hundredths place, the number of items and the total dollar amount sold rounded to the nearest hundredths place.

## Scan For

Write a function which accepts a filename and word as parameters, counts the number of times word appears in filename and prints it out in the following format:  

The word {*word*} appears {*count*} time(s) in {*filename*}

# Calc Tax

The calc_tax function accepts an in_filename and out_filename parameter. Given the input file where each row appears in the following format:  

Id  Amount  Tax Rate

Write a function that reads each line of the input file, calculates the tax (amount * rate) and writes each tax on a new line to a file named out_filename. 