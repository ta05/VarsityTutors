import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static boolean isValid(int grade) {
        return (grade >= 0 && grade <= 100) || grade == -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        double total = 0;

        System.out.print("Enter grade " + (count + 1) + " (-1 to stop): ");
        int grade = sc.nextInt();
        

        while (grade != -1) {
            while (!isValid(grade)) {
                System.out.print("Re-enter grade " + (count + 1) + " (-1 to stop): ");
                grade = sc.nextInt();
            }

            if (grade == -1) {
                break;
            }

            total += grade;
            count++;

            System.out.print("Enter grade " + (count + 1) + " (-1 to stop): ");
            grade = sc.nextInt();
        }

        if (count == 0) {
            System.out.println("Cannot calculate average for 0 grades.");
        }

        else {
            DecimalFormat df = new DecimalFormat("#.##");
            double average = total/count;
            System.out.printf("Your average is %s.\n", df.format(average));
        }
    }
}