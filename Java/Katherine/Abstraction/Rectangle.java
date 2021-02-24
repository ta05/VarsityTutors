import java.lang.Math;

// extends keyword indicates Rectangle inherits the public variables and methods from Shape
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        // Inherits the constructor from Shape
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // We fill out the code for getArea() and getPerimeter() which were abstract methods we inherited from Shape
    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    // toString method returns information about the instantiated Rectangle variable as a String
    public String toString() {
        return "The name of my shape is " + getName() + "\nThe area of my shape is " + Math.round(getArea()) + "\nThe perimeter of my shape is " + getPerimeter();
    }
}
