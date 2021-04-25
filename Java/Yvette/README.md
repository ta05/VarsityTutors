# Shape

Implement the Shape hierarchy -- create an abstract class called Shape, which will be the parent class to TwoDimensional and ThreeDimensional. The classes Circle, Square, and Triangle should inherit from TwoDimensional, while Sphere, Cube and Tetrahedson should inherit from ThreeDimensional.


Each Two Dimensional Shape should have the methods getArea() and getPerimeter(), which calculate the area and perimeter of the shape, respectively. Every Three Dimensional Shape should have the methods getArea() and getVolume(), which respectively calculate the surface area and volume of the shape. Every class should have a member variable containing its dimensions -- for example, the Circle class should have a member variable describing its radius, while the Triangle class should have the three member variables describing the length of each side. Note that the Tetrahedron should describe a regular tetrahedron, and as such, should only have one member variable.


Create a Driver class with a main method to test your Shape hierarchy. The program should prompt the user to enter the type of shape they'd like to create, and then the shape's dimensions. If the shape is two dimensional, the program should print its area and its perimeter, and if it's a three dimensional shape, its surface area and volume.