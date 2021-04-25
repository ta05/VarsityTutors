import java.lang.Math;

public class Circle extends TwoDimensional {
    private double radius;
    private String type;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Perimeter: " + Math.round(100*getPerimeter()) / 100.0 + "\nArea: " + Math.round(100*getArea()) / 100.0;
    }
}
