
public class CovidQueueTester {
    public static void main(String args[]) {
        CovidQ nyc = new CovidQ();

        nyc.remove();

        nyc.add(new Customer("David", 27, true));
        nyc.add(new Customer("Tolu", 26, false));
        nyc.add(new Customer("Geraldine", 68, false));
        nyc.add(new Customer("Nikhil", 27, true));
        nyc.add(new Customer("Matt", 20, false));
        nyc.add(new Customer("Jo", 79, false));

        String customers = "";
        for (Customer c : nyc.getQueue())
            customers += c.getName() + " ";
        System.out.println("Customers in line: " + customers.trim());
        
        Customer first = nyc.remove();

        nyc.remove();

        Customer third = nyc.peek();

        String remCustomers = "";
        for (Customer c : nyc.getQueue())
            remCustomers += c.getName() + " ";
        System.out.println("Customers in line: " + remCustomers.trim());

        System.out.println("\nThird Customer\n" + third);
    }
}
