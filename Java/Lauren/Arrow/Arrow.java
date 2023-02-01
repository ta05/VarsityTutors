import java.lang.Math;
import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        String tail = input[0];
        String head = input[1];

        for (int r = 0; r < 7; r++) {
            for (int c = 0; c < 9; c++) {
                if (c >= 0 && c <= 4) {
                    if (r >= 2 && r <= 4) {
                        System.out.print(tail);
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else if (c + Math.abs(3-r) <= 8) {
                    System.out.print(head);
                }
            }
            System.out.println();
        }
    }
}
