//This problem is about an Inventory of Products.  
//A manager uses this system to manage a store’s Inventory.  
//The incomplete Product class is given below.  
//Complete all methods and constructors. 

public class Product {
    private String name;
    private double price;
    private int quantity;
    private boolean isInStock;

    //initializes the instance variables [4 points]
    public Product(String name, double price, int q, boolean avail)
    {  
        this.name = name;
        this.price = price;
        this.quantity = q;
        this.isInStock = avail;
    }

    //name accessor method [1 point]
    public String getName()
    {
        return this.name;
    }

    //price accessor method [1 point]
    public double getPrice()
    {
        return this.price;
    }

    //quantity accessor method [1 point]
    public int getQuantity()
    {
        return this.quantity;
    }

    //in stock accessor method [1 point]
    public boolean getIsInStock()
    {
        return isInStock;
    }

    @Override
    public boolean equals(Object p) {
        if (p == null)
            return false;
        return ((Product) p).name.equals(this.name) && ((Product) p).price == this.price && ((Product) p).quantity == this.quantity
                && ((Product) p).isInStock == this.isInStock;
    }
    
    public String toString() {
        return "Name: " + name + "\nPrice: " + price + "\nQuantity: " + quantity + "\nAvailability: " + isInStock;
    }
}