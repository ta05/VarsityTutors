import java.lang.Math;

public class Sphere extends ThreeDimensional {
    private String type;
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getVolume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public String toString() {
        return "Area: " + Math.round(100*getArea()) / 100.0 + "\nVolume: " + Math.round(100*getVolume()) / 100.0;
    }
}
