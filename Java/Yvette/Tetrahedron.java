public class Tetrahedron extends ThreeDimensional {
    private String type;
    private double side;

    public Tetrahedron(double side) {
        super("Tetrahedron");
        this.side = side;
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return Math.sqrt(3) * Math.pow(side, 2);
    }

    public double getVolume() {
        return Math.pow(side, 3)/(6*Math.sqrt(2));
    }

    public String toString() {
        return "Area: " + Math.round(100*getArea()) / 100.0 + "\nVolume: " + Math.round(100*getVolume()) / 100.0;
    }
}
