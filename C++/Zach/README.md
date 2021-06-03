# Zachary

## 3. Convert Base

Write a program which converts a number from one base to a number in a new base. You may assume the number can be stored in an int without overflow.  

The program should expect three command line arguments:  

- a string representing the number to convert
- the base that the preceding string is represented in
- the base that the number should be converted to.  

The values of the original base and the target base will always be in the range 2 to 200 inclusive.  

The program should print the new representation to the standard output and then exit.


## 4. Heavy Numbers

### Heavy Sequence

A sequence of numbers (the heavy sequence)

y0, y1, y2, y3... yn ...  

is defined such that each number is the sum of digits squared of the previous number, in a particular base.

Consider numbers in base 10 with y0 = 12  
The next number in the sequence is y1 = 1^2 + 2^2 = 5  
The next number in the sequence is y2 = 5^2 = 25  
The next number in the sequence is y3 = 2^2 + 5^2 = 29  

### Heaviness

For each number y0 and base N, the heavy sequence converges to 1 or does not.  

A number whose sequence converges to 1 in base N is said to be "heavy in base N".

### Task

Write a program that reads a number *y* and a base *N* from the command line and retruns whether that *y* is heavy in the base *N* provided.

The program should return 1 if the number is heavy and 0 if it is not.

### Examples

- `heavy 4 10` returns 0
- `heavy 2211 10` returns 1
- `heavy 23 2` returns 1
- `heavy 10111 2` returns 1
- `heavy 12312 4000` returns 0