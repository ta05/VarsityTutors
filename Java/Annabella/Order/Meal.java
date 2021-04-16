import java.util.ArrayList;

public class Meal {
    private Sandwich sandwich;
    private Drink drink;
    private Cookie cookie;

    public Meal(Sandwich sandwich, Drink drink) {
        this.sandwich = sandwich;
        this.drink = drink;
    }

    public Meal(Sandwich sandwich, Drink drink, Cookie cookie) {
        this.sandwich = sandwich;
        this.drink = drink;
        this.cookie = cookie;
    }

    public double getCost() {
        double sum = cookie != null ? cookie.getCost() : 0;
        sum += sandwich.getCost() + drink.getCost();
        return sum;
    }

    public String toString() {
        String res = "Meal: (" + sandwich + ", " + drink;
        if(cookie != null)
            res += ", " + cookie;
        return res + ")";
    }
}