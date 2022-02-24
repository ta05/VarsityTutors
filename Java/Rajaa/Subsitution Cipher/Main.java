import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Substitution Cipher");
        
        System.out.println("\nWhat would you like to do?\n");
        System.out.println("****************************");
        System.out.println("* E - Encode a Message     *");
        System.out.println("****************************");
        System.out.println("* D - Decode a Message     *");
        System.out.println("****************************");
        System.out.println("* Q - Quit                 *");
        System.out.println("****************************");

        String s = sc.next().toUpperCase();
        sc.nextLine();
        
        while(!s.equals("Q")) {
            if(s.equals("E")) {
                System.out.print("Please enter a message to encode: ");
        
                String message = sc.nextLine();
                Encryption e = new Encryption(message);

                e.encrypt();
                e.writeMessage();
            } 
            else if(s.equals("D")) {
                Decryption d = new Decryption();
            }
            else {
                System.out.println("Invalid Input!");
            }

            System.out.println("\nWhat would you like to do?\n");
            System.out.println("****************************");
            System.out.println("* E - Encode a Message     *");
            System.out.println("****************************");
            System.out.println("* D - Decode a Message     *");
            System.out.println("****************************");
            System.out.println("* Q - Quit                 *");
            System.out.println("****************************");

            s = sc.next().toUpperCase();
            sc.nextLine();
        }
        

    }
}
