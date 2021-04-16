public class Sandwich {
    private String type;
    private double cost;

    public Sandwich(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return "Sandwich: (" + type + "," + cost + ")";
    }
}