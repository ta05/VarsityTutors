import java.util.Scanner;

public class CaesarShiftTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Caesar Cipher");
        
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

        while (!s.equals("Q")) {
            if (s.equals("E")) {
                System.out.print("\nPlease enter a plaintext message to encode: ");
                String text = sc.nextLine();
                System.out.print("Please enter a shift key value between 0-25: ");
                int shift = sc.nextInt();
                sc.nextLine();
                CaesarShiftEncryption c = new CaesarShiftEncryption(shift);

                System.out.println("\nYour cipher alphabet is: " + c.getAlphabet());
                System.out.println("\nYour encoded message is: " + c.encrypt(text.toLowerCase()));
            }
            else if (s.equals("D")) {
                System.out.print("\nPlease enter a ciphertext message to decode: ");
                String text = sc.nextLine();
                System.out.print("Please enter a shift key value between 0-25: ");
                int shift = sc.nextInt();
                sc.nextLine();
                CaesarShiftDecryption d = new CaesarShiftDecryption(shift);

                System.out.println("\nYour cipher alphabet is: " + d.getAlphabet());
                System.out.println("\nYour decoded message is: " + d.decrypt(text.toLowerCase()));
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
