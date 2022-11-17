import java.util.Scanner;

public class whileLoops {
    public static void pwCracker(String pw) {
        Scanner sc = new Scanner(System.in);

        boolean check = false;
        while(!check) {
            System.out.print("Please enter the password: ");
            String password = sc.next();

            if(password.equals(pw)) {
                System.out.println("Correct!");
                check = true;
            }
            else {
                System.out.println("Incorrect....");
            }
        }
    }

    public static void fizzBuzz(int num) {
        int n = 0;
        while (n <= num) {
            String word = "";
            if (n % 3 == 0) {
                word += "Fizz";
            }
            if (n % 5 == 0) {
                word += "Buzz";
            }

            if (word.length() == 0) {
                System.out.println(n);
            }
            else {
                System.out.println(word);
            }
            n++;
        }
    }

    public static int factorial(int num) {
        int result = 1;
        int n = 1;
        while (n <= num) {
            result *= n;
            n++;
        }
        return result;
    }

    public static double mathPow(double x, int y) {
        int n = 1;
        double result = 1;

        while (n <= y) {
            result *= x;
            n++;
        }

        return result;
    }

    public static int plusOdd() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("Please enter a number (Enter 999 to end): ");
        int num = sc.nextInt();

        while (num != 999) {
            if (num % 2 == 1) {
                sum += num;
            }
            System.out.print("Please enter a number (Enter 999 to end): ");
            num = sc.nextInt();
        }

        return sum;
    }
}
