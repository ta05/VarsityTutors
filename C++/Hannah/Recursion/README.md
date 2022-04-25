# Recursion

## `charNumTimes`

Write a recursive function that takes a number (n) and a character (c) and **prints out c, n times**.

### Examples

- `charNumTimes(5, 'X')` prints `XXXXX` to the terminal
- `charNumTimes(3, 'o')` prints `ooo` tot he terminal

## `sumDigits`

Write a recursive function that takes a number (n) and returns the **sum of all the digits**.

### Examples

- `sumDigits(54321)` returns `15`
- `sumDigits(421)` returns `7`

## `rPower`

Write a recursive power function that takes in a number (n) and an exponent (e) and **computes n<sup>e</sup>**. Hint: be careful not to accidentally call the cmath pow function.

### Examples

- `ePower(2,8)` returns 256
- `ePower(3,2)` returns 9

## `fibonacci`

Write a recursive function to compute the **Fibonacci sequence**. This function will take in a number (n) and will print out to the terminal n numbers from the Fibonacci sequence starting with 1. The Fibonacci sequence is: 0, 1, 1, 2, 3, 5, 8, 13... each number is the previous two numbers added together. Use a helper function to calculate the fibonacci sequence recursively. The main function can iteratively print each fibonacci term.

### Examples

- `fibonacci(4)` prints `0 1 1 2 3` to the terminal
- `fibonacci(0)` prints `0` to the terminal
- `fibonacci(1)` prints `0 1` to the terminal