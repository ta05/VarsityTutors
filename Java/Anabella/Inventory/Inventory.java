import java.util.ArrayList;

//The Inventory class that follows holds a list of Products. 
//An Inventory object manages this list of Products with a number of methods.  
//Complete all methods and constructors in the Inventory class.




public class Inventory {
    private ArrayList<Product> products = new ArrayList<Product>();

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    //constructs and adds the Product to the Inventory [2 points]
    public void addProduct(String n, double p, int q, boolean avail) {
        Product prod = new Product(n, p, q, avail);
        products.add(prod);
    }

    //removes the Product from the Inventory that has the attributes 
    //listed as the method’s parameters [2 points]
    public void removeProduct(String n, double p, int q, boolean avail) {
        Product prod = new Product(n, p, q, avail);
        products.remove(products.indexOf(prod));
    }

    //removes duplicates from the Inventory with the same name and price;
    //leaving only one such Product in the list. There may be duplicate 
    //products with the same name and price  [4 points]
    public Product removeDuplicateProducts(String name, double price) {
        Product prod = new Product(name, price, 0, false);
        boolean isInList = false;
        for (int i = 0; i < products.size(); i++) {

            if (products.get(i).getName().equals(name) && products.get(i).getPrice() == price) {
                if (isInList) {
                    prod = products.remove(i);
                    i--;
                }
                isInList = true;
            }
        }
        return prod;
    }

    //returns a list of Products that must be ordered because there are fewer    
    //than 10 in stock [4 points]
    public ArrayList<Product> mustOrder() {
        ArrayList<Product> orders = new ArrayList<Product>();
        for (Product p : products) {
            if (p.getQuantity() < 10)
                orders.add(p);
        }
        return orders;
    }


    public void addShipment(String[] list) {
        for (String item : list) {
            String name = item.substring(0, item.indexOf(":"));
            double price = Double.parseDouble(item.substring(item.indexOf(":") + 1, item.lastIndexOf(":")));
            int quantity = Integer.parseInt(item.substring(item.lastIndexOf(":") + 1));

            addProduct(name, price, quantity, true);
        }
    }
}