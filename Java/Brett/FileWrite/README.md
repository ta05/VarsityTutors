# Lab Assignment 11 - FileWrite

## Task

Create a `main` method. The purpose of this method is to prompt the user for their first name, last name and the grades they received on their three homework assignments. It should create variables for `name`, `average` and `grade` using the methods described below. The program should then call the `writeFile` method and write to a file called "YourName_Lab11.txt"

Create a method `public static String fullName(String firstName, String lastName)`. The purpose of this method is to combine the student's first and last names to create their full name.
- This method has two String parameters
- Combine the first name and last name
- This method should return the full name in all uppercase.

Create a method `public static double averageMark(int hw1, int hw2, int hw3)`. The purpose of this method is to calculate the average of the student's homework marks.
- This method has three `int` parameters
- Calculate the average of marks
- This method should return the average

Create a method `public static String grade(int hw1, int hw2, int hw3)`. The purpose of this method is to determine the letter grade of a student (Example: A, B, C, etc.)
- Call `averageMark()`. Store this method call inside a `double` type variable.
- Implement a decision structure (`if`, `else if`, `else` block).
  - If the average mark is greater than equal to return "A".
  - If it's greater than equal to 80 and less than 90, return "B".
  - If it's greater than equal to 70 and less than 80, return "C".
  - If it's greater than equal to 60 and less than 70, return "D".
  - Otherwise, return "Fail".

Create a method `public static void writeFile(String filename, String fullname, double average, String grade) throws FileNotFoundException`. The purpose of this method is to write all of your results inside a file.
- This method has four parameters:
  - Type `String` representing the `filename`.
  - Type `String` representing the `fullname`.
  - Type `double` representing the `average`.
  - Type `String` representing the `grade`.
- This method should create a text file `filename` in the project's directory.
- Create a `File` object.
- Create a `PrintWriter` object.
- You need to write the Full Name, Average Mark and the grade inside that file. **Print average mark with two decimal points.**
- Don't forget to `flush()` your `PrintWriter` object. Otherwise nothing will be written inside your text file.


## Example

**Input**

~~~
Enter your first name:
Tolu
Enter your last name:
Alimi
Enter grade of 3 courses:
85
75
95
~~~

**Output**

~~~
Full Name: TOLU ALIMI
Average Mark: 85.00
Grade is: B
~~~