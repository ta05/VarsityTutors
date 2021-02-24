// An Abstract class has at least one abstract method
public abstract class Shape {
    // private variables deny access to the variable outside of this class
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    // Abstract methods just have the method name and return type
    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "The name of my shape is " + getName();
    }
}