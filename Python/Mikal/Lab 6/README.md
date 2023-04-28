# Lab 6 - Functions

## 6.19: Driving Costs

Write a function `driving_cost` with input parameters `miles_per_gallon`, `dollars_per_gallon`, and `miles_driven` that returns the dollar cost to drive those miles. All items are of type float. The function called with the arguments `(20.0, 3.15999, 50.0)` returns `7.89975`.

Define that function in a program whose inputs are the car's miles per gallon and the price of gas in dollars per gallon (both float). Output the gas cost for 10 miles, 50 miles, and 400 miles, by calling your `driving_cost` function three times.

Output each floating-point value with two digits after the decimal point which can be achieved as follows: **`print(f'{your_value:.2f}')`**

### Example

Input:

~~~
20.0
3.1599
~~~

Output:

~~~
1.58
7.90
63.20
~~~

## 6.20: Step Counter

A pedometer treats walking 1 step as walking 2.5 feet. Define a function named `feet_to_steps` that takes a float as a parameter, representing the number of feet walked, and returns an integer that represents the number of steps walked. Then, write a main program that reads the number of feet walked as an input, calls function `feet_to_steps()` with the input as an argument, and outputs the number of steps as an integer.

Use floating-point arithmetic to perform the conversion.

### Example

Input:

~~~
150.5
~~~

Output:

~~~
60
~~~

## 6.21: Convert to Binary

Write a program that takes in a positive integer as input, and outputs a string of 1s and 0s representing the integer in binary. For an integer `x`, the algorithm is:

~~~
As long as x is greater than 0
    Output x % 2 (remainder is either 0 or 1)
    x = x // 2
~~~

Note: The above algorithm outputs the 0s and 1s in reverse order. You will need to write a second function to reverse the string.

### Example

Input:

~~~
6
~~~

Output:

~~~
110
~~~

## 6.22: Swapping Variables

Define a function named `swap_values` that takes four integers as parameters and swaps the first with the second, and the third with the fourth values. Then write a main program that reads four integers from input, calls function `swap_values` to swap the values, and prints the swapped values on a single line separated with spaces.

### Example

Input:

~~~
3
8
2
4
~~~

Output:

~~~
8 3 4 2
~~~

