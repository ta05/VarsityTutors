import java.lang.Math;
import java.util.Scanner;

public class HomeValue {
    public static double geometricMean(double[] rates) {
        double product = 1;
        for (double rate : rates) {
            product *= rate;
        }
        return Math.pow(product, 1.0/rates.length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*****Home Value Calculator*****");
        String resp = "y";
        do {
            System.out.print("Enter number of years (1-6): ");
            int years = sc.nextInt();
    
            double[] rates = new double[years];
            System.out.print("Enter percent change for each year: ");
    
            for (int i = 0; i < years; i++) {
                rates[i] = (100 + sc.nextInt())/100.0;
            }
    
            double avgAnnualRate = (geometricMean(rates) - 1) * 100;
    
            System.out.printf("Average percent change for each year is %.2f%%\n", avgAnnualRate);
            
            System.out.print("Again (y/n)? ");
            resp = sc.next();
            System.out.println();
        } while (resp.toLowerCase().equals("y"));


    }
}
