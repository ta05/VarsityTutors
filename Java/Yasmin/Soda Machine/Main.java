import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SodaMachine sm = new SodaMachine();
        String resp = "";

        do {
            if (sm.needsExactChange()) {
                System.out.println("The machine will need exact change.");
            }

            System.out.print("What soda would you like? ");
            String name = sc.next();

            System.out.print("Please enter the number of quarters: ");
            int quarters = sc.nextInt();
            System.out.print("Please enter the number of dimes: ");
            int dimes = sc.nextInt();
            System.out.print("Please enter the number of nickels: ");
            int nickels = sc.nextInt();

            double money = 0.25 * quarters + 0.1 * dimes + 0.05 * nickels;

            sm.makePurchase(name, money);

            System.out.println("Would you like to purchase another drink (y/n)? ");
            resp = sc.next().toLowerCase();
            
        } while (resp.toLowerCase().equals("y"));

    }
}
