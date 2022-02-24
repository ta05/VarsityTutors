import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Decryption {
    private String message;
    private String decipher;
    private String decipherAlphabet;

    public Decryption() throws FileNotFoundException {
        readFile();

        decrypt("abcdefghijklmnopqrstuvwxyz");
    }

    public String decrypt(String alphabet) {
        decipher = "";
        for (int i = 0; i < message.length(); i++) {
            int position = decipherAlphabet.indexOf(message.charAt(i));
            if (position > -1) {
                decipher += alphabet.charAt(position);
            }
            else {
                decipher += message.charAt(i);
            }
        }

        decipher = decipher.toUpperCase();

        System.out.println("The decipher alphabet is: " + decipherAlphabet);
        System.out.println("\nThe decoded message is:\n" + decipher);

        return decipher;
    }

    public void readFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("./message.txt"));

        message = sc.nextLine().toLowerCase();
        decipherAlphabet = sc.nextLine();
        sc.close();
    }
}
