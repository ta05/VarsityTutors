# Assignment

## 1-Move Character

### Problem Statement

Implement a function which takes two arguments: the first is a string and the second is a single character (as a string). This function should move every instance of the given character in the string to the end of the string, and then **return** (do NOT print) the final string.  

### Example

**Input**:  `"hello how are you?", "o"`  

**Output**:   `"hell hw are yu?ooo"`


## 2-Two Sum

### Problem Statement

Given a list and a target sum, return two indices of two integers, such that if we add them up, we will reach the target sum. For example, given a list of integers `A = [2, 8, 12, 15]`, if the target sum is 20, then your function return 1 and 2 , as `A[1] + A[2] = 8 + 12 = 20`.  

You can assume that only two integers in the list will equal the sum, when added.  

### Example

**Input**:  `[2, 8, 12, 15], 20`  

**Output**:   `[1, 2]`


## 4-Digit Sum

### Problem Statement

Define and implement a function `digit_sum` that takes a single number parameter (integer or float) and returns the sum of the digits of the number. If the number is negative, make the digit immediately following the negative sign negative (keep the rest of the digits in the number positive). Ignore periods representing decimal points.

### Examples

**Input**:  `1234`  

**Output**:   `10`  


**Input**:  `-593.42`  

**Output**:   `13`