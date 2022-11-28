import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of a side or a negative number to exit: ");
        int length = sc.nextInt();

        while (length >= 0) {
            for (int r = 0; r < length; r++) {
                for (int c = 0; c < length; c++) {
                    if (r == 0 || c == 0 || r == (length - 1) || c == (length - 1)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
            System.out.print("Enter the length of a side or a negative number to exit: ");
            length = sc.nextInt();
        }
    }
}
