import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String first = sc.nextLine();
        System.out.println("Enter your last name:");
        String last = sc.nextLine();
        System.out.println("Enter grade of 3 courses:");
        int hw1 = sc.nextInt();
        int hw2 = sc.nextInt();
        int hw3 = sc.nextInt();

        String name = fullName(first, last);
        double average = averageMark(hw1, hw2, hw3);
        String grade = grade(hw1, hw2, hw3);

        writeFile("./output/ToluAlimi_Lab11.txt", fullname, average, grade);


    }
    public static String fullName(String firstName, String lastName) {
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public static double averageMark(int hw1, int hw2, int hw3) {
        return (hw1 + hw2 + hw3)/3.0;
    }

    public static String grade(int hw1, int hw2, int hw3) {
        double average = averageMark(hw1, hw2, hw3);

        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "Fail";
        }
    }

    public static void writeFile(String filename, String fullname, double average, String grade) throws FileNotFoundException {
        File file = new File(filename);
        PrintWriter writer = new PrintWriter(file);

        writer.println("Full Name: " + fullname);
        writer.printf("Average Mark = %.2f\n", average);
        writer.println("Grade is: " + grade);

        writer.close();
    }
}
