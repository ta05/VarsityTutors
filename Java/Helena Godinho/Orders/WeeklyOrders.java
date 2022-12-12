import java.util.ArrayList;

public class WeeklyOrders {
    private ArrayList<DistributionOrder> orders;

    public WeeklyOrders() {
        orders = new ArrayList<DistributionOrder>();
    }

    public void add(DistributionOrder d) {
        for (int i = 0; i < orders.size(); i++) {
            if (d.getCompany().compareTo(orders.get(i).getCompany()) < 0) {
                orders.add(i, d);
                return;
            }
        }
        orders.add(d);
    }

    public boolean alreadyPlacedOrder(String company) {
        for (DistributionOrder order : orders) {
            if (order.getCompany().equals(company)) {
                return true;
            }
        }
        return false;
    }

    public int numberOfOrders(String company) {
        int count = 0;
        for (DistributionOrder order : orders) {
            if (order.getCompany().equals(company)) {
                count++;
            }
        }
        return count;
    }

    public int totalNumberOdBoxesOrdered(String company) {
        int count = 0;
        for (DistributionOrder order : orders) {
            if (order.getCompany().equals(company)) {
                count += order.getMasterOrder().getTotalBoxes();
            }
        }
        return count;
    }

    public int totalNumberOdBoxesOrdered() {
        int count = 0;
        for (DistributionOrder order : orders) {
            count += order.getMasterOrder().getTotalBoxes();
        }
        return count;
    }

    public void cancel(String cookieVariety) {
        for (Distribution order : orders) {
            order.getMasterOrder().removeVariety(cookieVariety);
        }
    }
}
