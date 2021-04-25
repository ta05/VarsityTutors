public abstract class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public abstract double getArea();
}
