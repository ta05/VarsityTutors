import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Instructor's name: ");
        String name = sc.nextLine();
        System.out.print("Enter the Instructor's department: ");
        String dept = sc.nextLine();
        System.out.print("Enter the Instructor's address: ");
        String address = sc.nextLine();
        System.out.print("Enter the Instructor's phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Enter the Instructor's id number: ");
        int id = sc.nextInt();
        System.out.print("Does the Instructor wish to be on the mailing list (Y/N): ");
        boolean mailList = sc.next().toLowerCase().equals("y");

        Instructor prof = new Instructor(name, dept, address, phoneNumber, id, mailList);

        System.out.println("The instructor's name is " + prof.getName());
        System.out.println("The instructor's department is " + prof.getDepartment());
        System.out.println("The instructor's address is " + prof.getAddress());
        System.out.println("The instructor's phone number is " + prof.getPhoneNumber());
        System.out.println("The instructor's id number is " + prof.getInstructorId());
        System.out.println("The instructor is on the mailing list: " + prof.isOnMailingList());
    }
}
