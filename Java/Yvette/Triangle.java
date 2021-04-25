import java.lang.Math;

public class Triangle extends TwoDimensional {
    private String type;
    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3) {
        super("Triangle");
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
    }

    public double getPerimeter() {
        return s1 + s2 + s3;
    }

    public String toString() {
        return "Perimeter: " + Math.round(100*getPerimeter()) / 100.0 + "\nArea: " + Math.round(100*getArea()) / 100.0;
    }
}
