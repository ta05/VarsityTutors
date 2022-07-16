public class Human {
    private String name;
    private double height;

    public Human(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String toString() {
        return "Name: " + name + "\nHeight: " + height;
    }
}