public abstract class ThreeDimensional extends Shape {
    
    private String type;

    public ThreeDimensional(String type) {
        super(type);
    }

    public abstract double getVolume();
}
