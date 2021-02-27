# Switch Statements and Conditionals

## Assignment 1

Rewrite the following if statements as a list of nested if statements:

if (score >= 90)
    grade = "A";
if (score >= 80 && score < 90)
    grade = "B";
if (score >= 75 && score < 80)
    grade = "C";
if (score >= 70 && score < 75)
    grade = "D";
if (score < 70)
    grade = "F";


## Assignment 2

Rewrite the following if statements as a switch statement

if(letter == 'a' || letter == 'A' || letter == 'b' || letter == 'B')
    System.out.println("You did very well!");
else if(letter == 'c' || letter == 'C' || letter == 'd' || letter == 'D')
    System.out.println("You could use some improvement.");
else
    System.out.println("Oh no...");


## Assignment 3

Write a program that will prompt the user to input a string. And then, prompt the user to input another string.

Next, the program will display a list of options


Command Options
-----------------------------------
Option a: checks if the length of the two strings are the same.
Option b: checks if two strings are the same or different.
Option c: checks which string is lexically larger, or if they are the same.
Option d: prints out the first character (index 0) of each string.
Option e: prints out a new string consisting of the first string concatenated (appended) with the second string.
Option f: prints out two strings using upper case letters.
Option q: quit the program.


The user will input one of the options. If the user inputs an a-f, the program will carry out the corresponding commands and ask the user to input a command again. If the user enters a q, then the program will quit. Otherwise print that the input was invalid.