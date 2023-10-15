import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();
        if (size % 2 == 0) {
            printEvenDiamond(size);
        }
        else {
            printOddDiamond(size);
        }

        sc.close();
    }

    public static void printOddDiamond(int size) {
        // Prints Top Half (including middle row)
        for (int row = 1; row <= (size + 1) / 2; row++) {
            for (int col = 1; col <= size; col++) {
                if (col + 2 * (row - 1) >= size) {
                    System.out.print(" *");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Prints Bottom Half
        for (int row = (size + 1) / 2 - 1; row >= 1; row--) {
            for (int col = 1; col <= size; col++) {
                if (col + 2 * (row - 1) >= size) {
                    System.out.print(" *");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printEvenDiamond(int size) {
        // Prints First Row
        for (int col = 1; col < size; col++) {
            System.out.print(" ");
        }
        System.out.println(" *");

        // Prints Top Half From Second Row (including Middle Row)
        for (int row = 2; row <= size / 2 + 1; row++) {
            for (int col = 1; col <= size; col++) {
                if (col + 2 * (row - 1) > size) {
                    System.out.print(" *");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Prints Bottom Half Until Last Row
        for (int row = size / 2 ; row >= 2; row--) {
            for (int col = 1; col <= size; col++) {
                if (col + 2 * (row - 1) > size) {
                    System.out.print(" *");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Prints Last Row
        for (int col = 1; col < size; col++) {
            System.out.print(" ");
        }
        System.out.println(" *");
    }
}