import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();

        inv.addProduct("Apples", 2, 10, true);
        inv.addProduct("Bananas", 1.5, 15, true);
        inv.addProduct("Clementines", 0.4, 60, true);
        inv.addProduct("Durians", 12, 4, true);
        inv.addProduct("Elderberries", 1.75, 120, true);

        System.out.println("There are " + inv.getProducts().size() + " items in the inventory.");
        
        inv.removeProduct("Bananas", 1.5, 15, true);
        inv.removeProduct("Durians", 12, 4, true);

        System.out.println("There are " + inv.getProducts().size() + " items in the inventory.");

        System.out.println(inv.getProducts().get(0).getName() + " are the first item in the inventory.");

        inv.addProduct("Clementines", 0.7, 12, true);
        inv.addProduct("Donuts", 5, 13, true);
        inv.addProduct("Elderberries", 1.75, 0, false);
        inv.addProduct("Snickers", 3.6, 20, true);
        inv.addProduct("Clementines", 0.4, 60, true);
        inv.addProduct("Clementines", 0.4, 60, true);
        inv.addProduct("Donuts", 5, 13, true);

        System.out.println("There are " + inv.getProducts().size() + " items in the inventory.");

        System.out.println(
                inv.removeDuplicateProducts("Clementines", 0.4).getName() + " were removed from the inventory");

        System.out.println("There are " + inv.getProducts().size() + " items in the inventory.");

        ArrayList<Product> order = inv.mustOrder();

        System.out.println("\nWe need to order the following items:");

        for(Product p: order)
            System.out.println(p.toString() + "\n");
        
        String[] shipment = { "Figs:10:40", "Grapefruits:3.5:25", "Honeydew Melons:22:5" };
        inv.addShipment(shipment);

        System.out.println("Here are all the items in out inventory:");

        for(Product p: inv.getProducts())
            System.out.println(p.toString() + "\n");
    }
}
