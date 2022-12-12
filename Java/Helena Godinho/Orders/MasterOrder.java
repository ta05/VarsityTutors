import java.util.ArrayList;

public class MasterOrder {
    private ArrayList <CookieOrder> orders;

    public MasterOrder() {
        orders = new ArrayList<CookieOrder>();
    }

    public void addOrder(CookieOrder order) {
        orders.add(order);
    }

    public int getTotalBoxes() {
        int count = 0;
        for (CookieOrder order : orders) {
            count += order.getNumBoxes();
        }

        return count;
    }

    public int removeVariety(String cookieVar) {
        int totalBoxes = 0;
        for (int i = orders.size() - 1; i >= 0; i--) {
            if (orders.get(i).getVariety().equals(cookieVar)) {
                totalBoxes += orders.remove(i);
            }
        }
        return totalBoxes;
    }

    public String toString() {
        String result = "";
        for (CookieOrder order : orders) {
            result += order.getVariety() +": " + order.getNumBoxes() + "\n";
        }
        return result.trim();
    }
}