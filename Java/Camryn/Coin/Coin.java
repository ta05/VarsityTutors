public class Coin {
    private int mintYear;
    private int value;
    private String country;

    public Coin(int year, int value, String country) {
        mintYear = year;
        this.value = value;
        this.country = country;
    }

    public int getYear() {
        return mintYear;
    }
}
