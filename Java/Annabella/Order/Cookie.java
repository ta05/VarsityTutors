public class Cookie {
    private String type;
    private double cost;

    public Cookie(String type, double cost) {
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
        return "Cookie: (" + type + "," + cost + ")";
    }
}
