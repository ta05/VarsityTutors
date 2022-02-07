# Odd Even

## Goal

This lab was designed to review basic class creation and to introduce and demonstrate how to use an ArrayList.

## Part 1 - Number

### Description

Write a number class that can be used to test numbers for odd, even and perfect. Use the sample runner code below to help you know which methods to write and how to design them and the class.

### Sample Runner Code:

~~~
int[] nums = {7, 28, 496, 1111, 199, 201, 17};
for (int num : nums) {
    Number n = new Number(num);
    if (n.isOdd()) {
        System.out.println(n + " is odd.");
    }
    else {
        System.out.println(n + " is even.");
    }
    if (n.isPerfect()) {
        System.out.println(n + " is perfect.");
    }
    else {
        System.out.println(n + " is not perfect.");
    }
~~~

## Sample Output:

~~~
7 is odd.
7 is not perfect.
28 is even.
28 is perfect.
496 is even.
496 is perfect.
1111 is odd.
1111 is not perfect.
199 is odd.
199 is not perfect.
201 is odd.
201 is not perfect.
17 is odd.
17 is not perfect.
~~~

## Part 2 - NumberAnalyzer

### Description

Use the number class to determine how many numbers in a list are odd, even and perfect.

### Sample Data: 
`5 12 9 6 1 4 8 6`  
`5 12 3 7 28 496 81 65 33 11`  
`1 2 3 4 5 6 7 8 11 13 151 16 17 18 19 20`  

### Sample Output
~~~
[5, 12, 9, 6, 1, 4, 8, 6]
Odd count = 3
Even count = 5
Perfect count = 2
~~~

~~~
[5, 12, 3, 7, 28, 496, 81, 65, 33, 11]
Odd count = 7
Even count = 3
Perfect count = 2
~~~

~~~
[1, 2, 3, 4, 5, 6, 7, 8, 11, 13, 151, 16, 17, 18, 19, 20]
Odd count = 9
Even count = 7
Perfect count = 1
~~~