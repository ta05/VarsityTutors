import java.util.HashMap;
import java.util.Map;

public class SodaMachine {
    private double totalMoneyAvailable;
    
    private HashMap<String, Soda> sodas;

    public SodaMachine() {
        totalMoneyAvailable = 2;

        sodas = new HashMap<String, Soda>();

        sodas.put("fanta", new Soda("fanta", 2, 3));
        sodas.put("coke", new Soda("coke", 2, 3));
        sodas.put("sprite", new Soda("sprite", 2, 3));
    }

    public boolean needsExactChange() {
        return totalMoneyAvailable < 2; 
    }

    public void makePurchase(String name, double money) {
        Soda soda = sodas.get(name);
        double price = soda.getPrice();

        if (price <= 0) {
            System.out.printf("We are sold out of %s.\n", name);
        }
        else if (money < price) {
            System.out.println("You don't have enough money to purchase a drink!");
        }
        else if (needsExactChange() && money != price) {
            System.out.println("You will need exact change!");
        }
        else {
            System.out.printf("Here is your %s.\n", name);
            sodas.put(name, new Soda(name, price, soda.getQuantity() - 1));
            totalMoneyAvailable += price;
            if(money != price) {
                double change = money - price;
                System.out.printf("Your change is $%.2f.\n", change);
            }
        }
    }

    public String toString() {
        String res = "Drink Availability:\n\n";
        for (Map.Entry<String, Soda> soda : sodas.entrySet()) {
            res += String.format("%s: %d - $%.2f\n", soda.getKey(), soda.getValue().getQuantity(), soda.getValue().getPrice());
        }
        return res;
    }
}
