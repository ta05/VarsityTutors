public abstract class TwoDimensional extends Shape {
    
    private String type;

    public TwoDimensional(String type) {
        super(type);
    }

    public abstract double getPerimeter();
}
