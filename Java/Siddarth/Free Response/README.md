# Free Response

## Odd and Even Digit Count

Gien a number, determine how many of its digits are off and how many are even. `1234` has 2 odd digits and 2 even digits. `425` has `1` odd digit and `2` even digits. `9112126` has `4` odd digits and `3` even digits.  


### Part A

Write the method `isOdd(int number)`. `isOdd` will determine if any given `number` is odd.  

- `isOdd(4)` returns `false`
- `isOdd(7)` returns `true`


### Part B

Write the method `getOddDigitCount(int number)`. `getOddDigitCount` will return the number of odd digits contained in any given `number`. You may call `isOdd` when writing method `getOddDigitCount`.  

- `getOddDigitCount(412)` returns `1`
- `getOddDigitCount(1356)` returns `3`


### Part C

Write the method `getEvenDigitCount(int number)`. `getEvenDigitCount` will return the number of even digits contained in any given `number`. You may call `isOdd` when writing method `getEvenDigitCount`.  

- `getEvenDigitCount(412)` returns `2`
- `getEvenDigitCount(1356)` returns `1`


## Letter Triangle

Given a number and a letter, print out the triangle shaped pattern as shown and described by part A and part B below. You must use part A when writing part B.


### Part A

Write method `getLetters(int howMany, String letter)`. `getLetters` will return a String that contains `howMany` `letter` of characters.

- `getLetters(4, "e")` returns `"eeee"`
- `getLetters(7, "W")` returns `"WWWWWWW"`
- `getLetters(3, " ")` returns `"   "`
- `getLetters(6, "8")` returns `"888888"`
- `getLetters(11, "X")` returns `"XXXXXXXXXXX"`


### Part B

Write method `getLetterTriangle(int numRows, String triLetter)`. `getLetterTriangle` will return a triangle of letters as shown below. The triangle will contain `numRows` rows of `triLetter` characters and spaces as shown below.  
You ***MUST*** call method `getLetters` when writing method `getLetterTriangle`.

`getLetterTriangle(4, "U")` returns:  

```
   U
  UU
 UUU
UUUU
```