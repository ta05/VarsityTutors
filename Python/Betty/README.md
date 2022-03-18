# Programming Project 3 - Luck of the Draw

## Background

The Python Pick 4 Lottery works like this: a customer picks 4 numbers in the range 1 through 9, inclusive, without duplicates. At a designated time, today's winning numbers are chosen randomly. Any customer who matches three of the four winning numbers wins a small amount and any customer who matches all four numbers wins a large amount. There is no reqard for matching two or fewer of the winning numbers.

For example, suppose Michael picked the numbers `[5, 7, 2, 9]` (this is called the customer's entry) and today's winning numbers are `[2, 8, 5, 3]`. Then Michael only matched two numbers. The order of the numbers does not matter. Sarah, who picked `[8, 5, 1, 2]`, has three matches. Gustav, who picked `[3, 5, 8, 2]`, has matched all four numbers.

Furthermore, a customer may choose to play the superball option for an extra fee. The superball gives the customer a chance to increase their number of matches. The superball value is a single number in the same range (1 to 9) and is randomly determined at the same time the winning numbers are picked. If the superball value is in today's winning numbers, it will be substituted for one of the numbers in the customer's entry that didn't match, increasing their matches by one.

For example, suppose Tom picked `[1, 4, 6, 7]` and chose the superball option. If the winning numbers are `[5, 3, 1, 6]` and the superball is 3, then Tom's initial two matches increase to three because the superball is used as a substitute for one of his incorrect values. If the superball value is not in the winning numbers, or the customer already picked the superball value, it has no effect.

## Program Behavior

Your program will randomly pick today's winning numbers and the superball value. It will then read a set of customer entries from a data file and determine how many of the entries are winners. Here's a sample output of the program:

~~~
Python Pick 4 Lottery Results

Today's winning numbers: [1, 8, 6, 2]
Today's superball: 3

Number of entries: 947
Number of entries that used superball: 293
Number of entries that matched 3 numbers: 139
Number of entries that matched 4 numbers: 9
~~~

Your program should produce output consistent with the example above. Include blank lines in the output as shown.

In that example, the superball value `3` was not in the winning numbers, so no one benefitted by using the superball option.

The data file you should read is called entries.txt, which contains one customer's pick (one entry) per line. Here are the first few lines of that data file.

~~~
5 6 9 8
7 9 1 6 sb
8 4 3 5 sb
9 2 8 7
7 3 1 6
3 1 2 7 sb
7 9 3 5
7 3 9 1 sb
1 8 9 4
6 1 5 9
6 2 9 7
2 3 4 5
1 2 5 4
~~~

Each line in the data file contains the four numbers chosen by a particular customer separated by spaces. If the line has the characters sb at the end, that means that customer has opted to play the superball.

You can assume the data in the data file is valid and formatted correctly: four numbers per line, no duplicates per entry, etc.

Here's another sample run of the program using the same data file:

~~~
Python Pick 4 Lottery Results

Today's winning numbers: [5, 9, 8, 1]
Today's superball: 9

Number of entries: 947
Number of entries that used superball: 293
Number of entries that matched 3 numbers: 190
Number of entries that matched 4 numbers: 22
~~~

This time, the superball value is in the set of winning numbers, so many (but not all) customers who played the superball option had their number of matches increased by 1.

The numbers reported in the last two lines of the output include those that were increased by the superball option. The count of three matches does not include those that matched four.

## Code Requirements

Name your program file **project3.py** (all lowercase). MAKE SURE THE FILE IS NAMED CORRECTLY. All code you write for this project should be contained in this file. The only module that should be imported for this program is the random module.

Your program should include the following functions. ALL CODE IN YOUR SOLUTION SHOULD BE IN ONE OF THESE FUNCTIONS EXCEPT FOR THE `if` STATEMENT PROVIDED BELOW. Do NOT nest the definition of any function inside another.

`pick_winning_numbers` - This function returns a list containing the winning numbers, determined randomly. The function should accept three arguments, in this order: the minimum and maximum values in the range, and a count representing how many values to include. The result should represent a random sampling of the integers from the minimum through the maximum, inclusive, without duplicates. When this function is called from the main function, it will be passed a range of 1 through 9 and a count of 4, but this function should be written to operate on the values specified by the arguments.

`pick_superball` - This function picks and returns the superball value (one integer), chosen at random from the range specified by its two arguments, representing the minimum and maximum, inclusive. As with pick_winning_numbers, write the function so that it works for any range.

`convert_list_to_integers` - This function accepts a list of strings as an argument and returns a corresponding list of integers. You may assume that each string in the argument represents a valid integer. This function is used to convert the values of a customer's entry, which are read as strings from the data file, into numbers.

`count_matches` - This function accepts two lists of integers as arguments. The first argument is the list of today's winning numbers. The second argument is a list representing a customer's entry. The function should determine and return the number of matches between the two lists. That is, it should determine how many of the entry's values are found in the list of winning numbers. This function does NOT take the superball option into account. The argument that represents the customer's entry should NOT include the sb option designation from the data file.

`main` - This function represents the main program. It should call the other functions as needed to get the job done. This function should print all output for the program. The main function should pick and print today's winning numbers and the superball value. Then it should use a with statement and a for loop (see the Reading and Writing Text Files (Links to an external site.) topic in Rephactor) to read all lines in the data file and process each entry. For each line in the file:

Split the line into a list of separate values.
Note if the current entry is using the superball option and then, if so, remove the sb indicator from the list.
Convert the list of input values, which were read as strings, to a list of integers.

Determine how many of the entry numbers match the winning numbers.

If the superball option is in play, determine if the number of basic matches should be increased by one. That only occurs if the superball value is in the winning numbers and not in the customer's entry.

Note if the entry ended up with three or four matches. An entry that made fewer than three matches it can be ignored.
After the entire data file is processed, the main function should produce the final output as shown in the examples above.