public class Square extends TwoDimensional {
    private double side;
    private String type;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public String toString() {
        return "Perimeter: " + Math.round(100*getPerimeter()) / 100.0 + "\nArea: " + Math.round(100*getArea()) / 100.0;
    }
}
