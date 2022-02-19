import java.lang.Math;
import java.util.Scanner;

public class DistanceInThePlane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of x1: ");
        int x1 = sc.nextInt();
        System.out.print("Please enter the value of y1: ");
        int y1 = sc.nextInt();
        System.out.print("Please enter the value of x2: ");
        int x2 = sc.nextInt();
        System.out.print("Please enter the value of y2: ");
        int y2 = sc.nextInt();
        sc.close();

        double distance = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
        double midX = (x1 + x2)/2.0;
        double midY = (y1 + y2)/2.0;

        System.out.printf("The distance between (%d,%d) and (%d,%d) is %.2f\n", x1, y1, x2, y2, distance);
        System.out.printf("The midpoint of (%d,%d) and (%d,%d) is (%.1f,%.1f)", x1, y1, x2, y2, midX, midY);
    }
}
