import java.util.ArrayList;

public class GroceryList {
    public static void removeItem(ArrayList<String> li, String item) {
        System.out.println("My li list has " + li.size() + " item(s)");
        for (int i = 0; i < li.size(); i++) {
            if (li.get(i).equals(item)) {
                li.remove(i);
            }
        }
        System.out.println("My li list has " + li.size() + " item(s)");
    }
    
    public static void main(String args[]) {
        ArrayList<String> groceries = new ArrayList<String>();
        groceries.add("apple");
        groceries.add("banana");
        groceries.add("clementine");
        groceries.add("durian");
        groceries.add("elderberry");

        System.out.println("My grocery list has " + groceries.size() + " item(s)");
        removeItem(groceries, "durian");
        System.out.println("My grocery list has " + groceries.size() + " item(s)");
    }
}
