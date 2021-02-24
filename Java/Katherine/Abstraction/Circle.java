import java.lang.Math;

// extends keyword indicates Circle inherits the public variables and methods from Shape
public class Circle extends Shape {
    private double radius;

    // Inherits the constructor from Shape
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // We fill out the code for getArea() and getPerimeter() which were abstract methods we inherited from Shape
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * (this.radius);
    }

    // toString method returns information about the instantiated Circle variable as a String
    public String toString() {
        return "The name of my shape is " + getName() + "\nThe area of my shape is " + Math.round(getArea()) + "\nThe circumference of my shape is " + Math.round(getPerimeter());
    }
}

