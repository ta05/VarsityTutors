public class Textbook extends Book implements PublicationInfo{
    private String field;
    private String topic;

    public Textbook(String title, String author, int pubYear, int pages, int medium, int numPrinted, int cost, double price, int numSold, int positiveReviews, int negativeReviews, String field, String topic) {
        super(title, author, pubYear, pages, medium, numPrinted, cost, price, numSold, positiveReviews, negativeReviews);
        this.field = field;
        this.topic = topic;
    }

    public String getField() {
        return field;
    }
    
    public void setField(String field) {
        this.field = field;
    }

    public String getTopic() {
        return topic;
    }
    
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public boolean CostEffective() {
        return this.getNumSold() * this.getPrice() > this.getCost();
    }

    public boolean GeneratesInterest() {
        return this.getPositiveReviews() > this.getNegativeReviews() && (double)this.getNumSold()/this.getCopiesPrinted() >= 0.8;
    }

    public String toString() {
        return super.toString() + "\nField: " + field + "\nTopic: " + topic + "\n";
    }
}
