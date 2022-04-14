# Lab Assignment 12 - Classes

## Task

Create a class called **`Sphere`**.

Create the two instance variables using variable names of your choice:
- Integer for the diameter of the sphere
- Double for the radius

Create a constructor for the class **`Sphere`**.
- The constructor should take one paramter:
  - The diameter of the sphere.
- In the body of the constructor, use the parameter to inititalize the value of the instance variables created in the previous step to the corresponding parameter.

Create a method named `public double getRadius()`. THe purpose of this method is to return the value radius.

Create a method named `public double getSurfaceArea()`. The purpose of this method is to calculate and return the surface area.

Create a method named `public double getVolume()`. The purpose of this method is to calculate and return the volume.

Create a method named `public void displayResults()`. The purpose of this method is to print the values of the radius, surface area and volume.

Create a class in the same project folder called `SphereTester.java`. Add a main method to the file. Import the Scanner class from the `java.util` package. The main method should:
- Create your scanner object with a name of your choice.
- Welcome the user to the program using a print statement.
- Ask the user to enter the value of the sphere's diameter.
- Store the diameter in an integer type variable.
- Create an instance of the `Sphere` class. Pass the diameter as a parameter.
- Call the method `displayResults` from the class `Sphere`.
- Close the Scanner object.

## Example

~~~
Enter the diameter:
6
The radius of the sphere is 3.0
The surface area of the sphere is 113.09733552923255
The volume of the sphere is 113.09733552923254
~~~