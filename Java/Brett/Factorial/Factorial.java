import java.util.Scanner;

public class Factorial {
    public static void welcome() {
        System.out.println("-----Welcome to our Factorial class-------");
    }
    public static int factorialUsingFor(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public static int factorialUsingWhile(int n) {
        int result = 1;
        while (n > 0) {
            result *= n;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        welcome();

        System.out.println("Enter a number:");

        int n = sc.nextInt();

        sc.close();

        System.out.printf("Factorial using while loop:%d! = %d\n", n, factorialUsingWhile(n));
        System.out.printf("Factorial using for loop:%d! = %d", n, factorialUsingFor(n));
    }
}
