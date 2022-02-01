public class Novel extends Book{
    private String genre;

    public Novel(String title, String author, int pubYear, int pages, int medium, int numPrinted, int cost, double price, int numSold, int positiveReviews, int negativeReviews, String genre) {
        super(title, author, pubYear, pages, medium, numPrinted, cost, price, numSold, positiveReviews, negativeReviews);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean CostEffective() {
        return this.getNumSold() * this.getPrice() > this.getCost();
    }

    public boolean GeneratesInterest() {
        return this.getPositiveReviews() > this.getNegativeReviews() && (double)this.getNumSold()/this.getCopiesPrinted() >= 0.65;
    }

    public String toString() {
        return super.toString() + "\nGenre: " + genre + "\n";
    }
}
