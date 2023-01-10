# Home Value

## Background

A home purchased for 300,000 dollars increases in value by 10% after one year and by another 20% after a second year. Thus, one year after purchasing the house, its value is 1.10 * 300,000 dollars and after two years 1.20 * 1.10 * 300,000 dollars. A third year decrease of 6% drops the value to 94% of the previous value: 0.94 * 1.20 * 1.10 * 300,000 dollars = 372,240 dollars. Notice that the multiplier 1 - 0.06 = 0.94. The average annual increase over the three year period is the geometric mean of 1.10, 1.20 and 0.94. In general, the geometric mean of n numbers is the nth root of their product. Thus the geometric mean of 1.10, 1.20 and 0.94 is (1.10 * 1.20 * 0.94) ^ (1/3) = 1.074568. The product of 1.074568 * 1.074568 * 1.074568 * 300,000 = 372,240. In other words, the home's value after three annual changes of 10%, 20% and -6% is the same as if each year, the home's value increased by 7.4568%.


## Task

Write a program that calculates the average annual change on a real estate investment held from one to six years. Your program should first prompt for the length of the investment (an integer between one and six inclusive) and then the percent change for each year. A negative number indicates a decrease. The program should display the average annual change. Your program should display the average annual change. Your program should be able to run as many times as a user chooses. For example, if a home, over a 6 year period, has changed in value by `10%`, `20%`, `6%`, `-8%`, `-12%`, and `3%`, then to calculate the average annual change, you would calculate the geometric mean of `1.1`, `1.2`, `0.92`, `0.88`, and `1.03`. You may find `Math.pow()` and `switch` helpful.


## Sample Output

~~~
*****Home Value Calculator*****
Enter number of years (1-6): 3
Enter percent change for each year: 10 20 -6
Average percent change for each year is 7.46%
Again (y/n)? y

Enter number of years (1-6): 6
Enter percent change for each year: 10 20 6 -8 12 3
Average percent change for each year is 6.81%
Again (y/n)? n
~~~

