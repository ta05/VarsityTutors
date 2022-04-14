import java.lang.Math;

public class Sphere {
    
    private double radius;
    private int diameter;

    public Sphere(int d) {
        radius = d/2.0;
        diameter = d;
    }

    public double getRadius() {
        return radius;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getVolume() {
        return 4.0/3 * Math.PI * Math.pow(radius, 3);
    }

    public void displayResults() {
        System.out.println("The radius of the sphere is " + radius);
        System.out.println("The surface area of the sphere is " + getSurfaceArea());
        System.out.println("The volume of the sphere is " + getVolume());
    }
}
