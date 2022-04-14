import java.util.Scanner;

public class SphereTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the diameter:");
        int d = sc.nextInt();

        Sphere s = new Sphere(d);

        s.displayResults();
    }
}
