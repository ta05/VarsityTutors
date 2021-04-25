public class Cube extends ThreeDimensional{
    private String type;
    private double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return 6 * Math.pow(side, 2);
    }

    public double getVolume() {
        return Math.pow(side, 3);
    }

    public String toString() {
        return "Area: " + Math.round(100*getArea()) / 100.0 + "\nVolume: " + Math.round(100*getVolume()) / 100.0;
    }
}
