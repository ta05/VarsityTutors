# Count Factorial Digits

## Overview

For this daily, write a program that will calculate and display N! and the number of digits in the factorial.

A CPP file (***factorial_digits.cpp***) has been provided. It contains the declaration for an integer variable (N) and code that will ask the user to enter an integer value.

Add code that will ceck the N value for validity. To be valid, the N value must be greater than or equal to 0 and less than or equal to 12. If an invalid N value is entered, display an error message and stop execution of the progra,. The error message displayed to the user MUST match the message that is displayed in the output below. Print a new line at the beginning of and end of the error message.

For a valid N value, write a loop to calculate N!. Remember that N! is equal to the product of the values from 1 through N for all N values that are greater than or equal to 1. For N equal to 0, 0! is equal to 1.

Once the factorial has been calculated, write code that will count the number of digits in the factorial.

Finallym display the original N value, the factorial, and the number of digits as follows:

***[N_value]*** is equal to ***[factorial_value]***. There are ***[digits]***.

where ***[N_value]*** is the original N value entered at the beginning of the program, ***[factorial_value]*** is the calculated factorial, and ***[digits]*** is the number of digits in the factorial.

Print a new line at the beginning and end of the output.

## File You Must Submit

Place the completed program code in a source file named ***factorial_digits.cpp***

## Output

The output that is produced by the program will vary based on the values that are entered when the program is executed. The output that is shown below is what the program will produce when the program is executed. The output that is shown below is what the program will produce when it is run in an environment such as Dev C++ or XCode. When it is run through the Autograder, the portion that asks for the integer value and error message WILL NOT show the value that is entered.

This is used to produce the output for diff 1:

~~~
N value (must be greater than or equal to 0)? 6

6! is equal to 720. There are 3 digits.
~~~

This is used to produce the output for diff 2:

~~~
N value (must be greater than or equal to 0)? 12

12! is equal to 479001600. There are 9 digits.
~~~

This is used to produce the output for diff 3:

~~~
N value (must be greater than or equal to 0)? 0

0! is equal to 1. There are 1 digits.
~~~

This is used to produce the output for diff 4:

~~~
N value (must be greater than or equal to 0)? -6

Invalid Input: -6
~~~

This is used to produce the output for diff 5:

~~~
N value (must be greater than or equal to 0)? 15

Invalid Input: 15
~~~