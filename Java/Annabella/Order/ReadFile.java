import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class ReadFile {

    private String fileName;
    private ArrayList orders;

    public ReadFile(String fileName) {
        this.fileName = fileName;
        orders = new ArrayList();
    }

    public ArrayList<String> getList() throws Exception {
        ArrayList<String> list = new ArrayList<String>();

        FileReader fstream = new FileReader(fileName);
        BufferedReader in = new BufferedReader(fstream);

        String value = "";
        while (value != null) {
            value = in.readLine();
            if (value != null) {
                list.add(value);
            }
        }
        in.close();
        return list;
    }

    public String getTypeFromEntree(String order) {
        return order.substring(0, order.indexOf(","));
    }

    public double getCostFromEntree(String order) {
        return Double.parseDouble(order.substring(order.indexOf(",") + 1));
    }

    public ArrayList addOrders() throws Exception {
        ArrayList<String> textOrders = getList();

        for (String order : textOrders) {
            String entree = order.substring(0, order.indexOf(":"));

            if (entree.equals("Sandwich") || entree.equals("Drink") || entree.equals("Cookie")) {
                order = order.substring(order.indexOf("(") + 1, order.length() - 1);
                String type = getTypeFromEntree(order);
                double cost = getCostFromEntree(order);
                switch (entree) {
                case "Sandwich":
                    orders.add(new Sandwich(type, cost));
                    break;
                case "Drink":
                    orders.add(new Drink(type, cost));
                    break;
                case "Cookie":
                    orders.add(new Cookie(type, cost));
                    break;
                default:
                    break;
                }
                ;
            } else if (entree.equals("Meal")) {
                order = order.substring(order.indexOf("(") + 2, order.length() - 2);
                String[] mealList = order.split("\\),\\(");
                Sandwich sandwich = new Sandwich(getTypeFromEntree(mealList[0]), getCostFromEntree(mealList[0]));
                Drink drink = new Drink(getTypeFromEntree(mealList[1]), getCostFromEntree(mealList[1]));
                if (mealList.length == 3) {
                    Cookie cookie = new Cookie(getTypeFromEntree(mealList[2]), getCostFromEntree(mealList[2]));
                    orders.add(new Meal(sandwich, drink, cookie));
                }
                else
                    orders.add(new Meal(sandwich, drink));
            }

        }
        return orders;
    }
    
    public double totalCosts() {
        double sum = 0;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i) instanceof Meal)
                sum += ((Meal) orders.get(i)).getCost();
            else if (orders.get(i) instanceof Sandwich)
                sum += ((Sandwich) orders.get(i)).getCost();
            else if (orders.get(i) instanceof Drink)
                sum += ((Drink) orders.get(i)).getCost();
            else if (orders.get(i) instanceof Cookie)
                sum += ((Cookie) orders.get(i)).getCost();
        }
        return sum;
    }
}
