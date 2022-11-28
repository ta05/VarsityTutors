import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountPairs counter = new CountPairs();

        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        int count = counter.pairCounter(s);

        if (count == 1) {
            System.out.println("There is " + count + " letter pair.");
        }
        else {
            System.out.println("There are " + count + " letter pairs.");
        }
    }
}
