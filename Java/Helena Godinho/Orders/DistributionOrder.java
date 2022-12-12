public class DistributionOrder {
    private String company;
    private MasterOrder order;

    public DistributionOrder(String company, MasterOrder order) {
        this.company = company;
        this.order = order;
    }

    public String getCompany() {
        return company;
    }

    public MasterOrder getMasterOrder() {
        return order;
    }
}
