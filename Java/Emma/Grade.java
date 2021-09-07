import java.util.Scanner;

public class Grade {
    public static void main(String args[]) {
        double total = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your grade (enter negative number to stop): ");
        double grade = sc.nextDouble();

        while (grade >= 0) {
            total += grade;
            count++;
            System.out.print("Please enter your grade (enter negative number to stop): ");
            grade = sc.nextDouble();
        }

        if (count == 0) {
            System.out.println("Invalid grade entries");
        }
        else {

            System.out.printf("\nAverage Grade: %.1f", total/count);
        }
    }
}
