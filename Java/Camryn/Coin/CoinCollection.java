import java.util.ArrayList;

public class CoinCollection {
    private ArrayList<Coin> coins;

    public CoinCollection(int[] years, int[] values, String[] countries) {
        coins = new ArrayList<Coin>();
        for (int i = 0; i < years.length; i++)
            coins.add(new Coin(years[i], values[i], countries[i]));
    }

    public boolean isRare(int year) {
        for (Coin c : coins) {
            if(c.getYear() < year)
                return true;
        }
        return false;
    }
}
