public class Book {
    private String title;
    private String author;
    private int pubYear;
    private int pages;
    private int medium;
    private int numPrinted;
    private int cost;
    private double price;
    private int numSold;
    private int positiveReviews;
    private int negativeReviews;

    public Book(String title, String author, int pubYear, int pages, int medium, int numPrinted, int cost, double price, int numSold, int positiveReviews, int negativeReviews) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
        this.pages = pages;
        this.medium = medium;
        this.numPrinted = numPrinted;
        this.cost = cost;
        this.price = price;
        this.numSold = numSold;
        this.positiveReviews = positiveReviews;
        this.negativeReviews = negativeReviews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return pubYear;
    }

    public void setPublishedYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public int getNumPages() {
        return pages;
    }

    public void setNumPages(int pages) {
        this.pages = pages;
    }

    public String getMedium() {
        switch(medium) {
            case 0:
                return "printed hardcover";
            case 1:
                return "printed softcover";
            case 2:
                return "electronic";
            case 3:
                return "all";
            default:
                return "none";
        }
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public int getCopiesPrinted() {
        return numPrinted;
    }

    public void setCopiesPrinted(int numPrinted) {
        this.numPrinted = numPrinted;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumSold() {
        return numSold;
    }

    public void setNumSold(int numSold) {
        this.numSold = numSold;
    }

    public int getPositiveReviews() {
        return positiveReviews;
    }

    public void setPositiveReviews(int positiveReviews) {
        this.positiveReviews = positiveReviews;
    }

    public int getNegativeReviews() {
        return negativeReviews;
    }

    public void setNegativeReviews(int negativeReviews) {
        this.negativeReviews = negativeReviews;
    }

    public String toString() {
        return title +" by " + author + " published in " + pubYear + "\n\nBook Statistics:\nMedium: " + getMedium() + "\nCopies Printed: " + numPrinted + "\nCopies Sold: " + numSold + "\nProduction Cost: $" + cost + "\nSale price: $" + price + "\nReviews: " + positiveReviews + " positive reviews. " + negativeReviews + " negative reviews.\n";
    }
}
