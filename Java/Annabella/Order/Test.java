import java.util.ArrayList;
import java.util.regex.Pattern;
import java.lang.String;

public class Test {
    public static void main(String[] args) throws Exception {
        ReadFile rf = new ReadFile("./files/list1.txt");
        ArrayList orders = rf.addOrders();
        for (int i = 0; i < orders.size(); i++)
            System.out.println(orders.get(i));
        System.out.printf("\nThe total cost of all the meals is: $%.2f", rf.totalCosts());
    }
}
