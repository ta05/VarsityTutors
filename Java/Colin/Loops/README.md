# Loops

## Average Grade

Prompt the user to input an integer test score from 0 to 100. If the user enters a number greater than 100 or less than 0 (except for -1 which will terminate the program). Reprompt the user for a new score. Do not include invalid scores in the calculation.

Using a sentinel value of -1, continue prompting the user to enter grades until they wish to stop.

Compute and print the average of the student's grades that are entered as a double.

### Example Outputs

~~~
Enter grade: 1 (-1 to stop): 82
Enter grade: 2 (-1 to stop): 75
Enter grade: 3 (-1 to stop): -1
Your average is 78.5
~~~

~~~
Enter grade: 1 (-1 to stop): 105
Re-enter grade: 1 (-1 to stop): 100
Enter grade: 2 (-1 to stop): 98
Enter grade: 3 (-1 to stop): 90
Enter grade: 4 (-1 to stop): 85
Enter grade: 5 (-1 to stop): -1
Your average is 93.25
~~~

~~~
Enter grade: 1 (-1 to stop): -1
Cannot calculate average for 0 grades.
~~~

## Count Pairs

### **`Main`**

Prompt the user to enter a String. Create a `CountPairs` object. Call the `pairCounter` method and print its result when being passed the user's string.

### **`CountPairs`**

Do not modify the constructor. Complete the `pairCounter` method. This method will go through the string and count up and return the number od letter pairs present. A letter pair is any two adjacent letters with the same value. This method uses a **for loop**.

### Example

~~~
Enter a String: doggy
There is 1 letter pair.
~~~

~~~
Enter a String: mississippi
There are 3 letter pairs.
~~~

## Cool Number

A Cool Number is any number that has a remainder of 1 when divided by 3, 4, 5, and 6.

Complete the `isCoolNumber` method according to the comments in `CoolNumbers.java` **no loop needed**. Complete the `countCoolNumbers` method according to the comments in `CoolNumbers.java` **must user a for loop**. In the main method, write core to test your method implementations to see how many cool numbers there are up to 250, -4, 1000, 101, 150 and 2.

### **Test Cases**

- `CoolNumbers.countCoolNumbers(250)` returns `4`
- `CoolNumbers.countCoolNumbers(-4)` returns `-1`
- `CoolNumbers.countCoolNumbers(1000)` returns `16`
- `CoolNumbers.countCoolNumbers(101)` returns `1`
- `CoolNumbers.countCoolNumbers(150)` returns `2`
- `CoolNumbers.countCoolNumbers(-1)` returns `-1`


## String Algoerithms 1

### **`printByWord`**

Complete the method `printByWord`. The method should use a for loop to print the String parameter as below. Your loop should work no matter what the string literal word actually contains.

### **Example**

~~~java
// If the String "HelloWorld" was passed then the following would print:
H
He
Hel
Hell
Hello
HelloW
HelloWo
HelloWor
HelloWorl
HelloWorld
~~~

**In the main method, call the method `printByWord` with "HelloWorld", "", and "ABC DEF".**

### **`noSpaces`**

Complete the method `noSpaces`, that uses a for loop to take the String parameter, creates a new String with all spaces removed and returns it.

### Example

`noSpaces("You may begin.")` returns `"Youmaybegin."`

**In the main method, call the method `noSpaces` with "You may begin", "", "ABC", and "A P C S A"**

### **`reverse`**

Write the metohd reverse, that returns a new String that has all of the characters of String str in reverse. Hint: Start with a String called result that is "". Go through String str in reverse, concatenating each character onto result.

### Example

`reverse("ABC")` returns `"CBA"`

**In the main method, call the method `reverse` with "You may begin.", "", "ABC", and "A P C S A"**


## String Algoerithms 2

Write a program that reads a string from the user.

Using a for loop and String class methods, print one character of the String per line. If the character is a space, then it should not print.

Using a for loop and String class methods, print every other character on the same line (including spaces).

Using a for loop and String class methods, print out just the vowels on the same line with no spaces in between. The vowels should print if they are lower or upper case.
- Hint: There is a clever way to do this using a String object you create containing vowels and `indexOf` than writing boolean conditions for each vowel.

Using a for loop and String class methods, count and display how many times the String "on" is contained in the String provited by the user. "on" is case sensitive so only lowercase 'o' and lowercase 'n'.

### **Example**

~~~
Enter a string: wilton schools
One character per line:
w
i
l
t
o
n
s
c
h
o
o
l
s
Every other character:
wlo col
Only vowels:
iooo
Number of times "on" appears:
1
~~~

## Drawing Boxes

You must write code that will allow the user to repeatedly enter an integer value, and then draw an empty box with sides made of '*' characters that have sides equal in length to the number the user enters.

The program should end when the user enters a negative value.

The program should print nothing if 0 is entered, but continue prompting the user.

### **Example**

~~~
Enter the length of a side or a negative number to exit: 0
Enter the length of a side or a negative number to exit: 1
*
Enter the length of a side or a negative number to exit: 2
**
**
Enter the length of a side or a negative number to exit: 3
***
* *
***
Enter the length of a side or a negative number to exit: 4
****
*  *
*  *
****
Enter the length of a side or a negative number to exit: 5
*****
*   *
*   *
*   *
*****
Enter the length of a side or a negative number to exit: -10
~~~