# List of Students Lab

## Task

Update your class for Student. Make sure you have the following:

- Constructor to set the values
- toString to nicely display the values
- method to getHeight, getGPA as needed
- method to update the gpa

Make sure your Course class has these updates:
- Change array of Student to an ArrayList of at least 5 students in no set order
  - You can create Students in either the main class or Course class
  - You need an add(Student newStudent) method to add a student to the course
- Add a method, findTallest (or find max of another variable in Student class), that returns the tallest(max) student
- Add a toString that returns a string with all of the students
- *Challenge*: Add a method drop(String name) that finds the student with the matching name and then drops them from the class

## Testing

Create a tester class that:
- Creates a Course with 5 students
- Prints them out
- Calls the findTallest method and prints the result

## Requirements

- Must use an ArrayList of Student objects
- findTallest works with the ArrayList
- toString needs to be called (i.e. tested) from the main (implicitly is ok) and should print out all instance variables of the Student object.
- list of at least 5 students either automatically or based on user input is/can be created
- works without exception
- must have 3 classes: Main, Course, Student