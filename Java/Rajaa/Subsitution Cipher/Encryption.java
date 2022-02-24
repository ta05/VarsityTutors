import java.io.FileWriter;
import java.io.IOException;
import java.lang.Math;
import java.util.Scanner;

public class Encryption {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private String cipherAlphabet;
    private String message;
    private String cipher;

    public Encryption(String m) {
        message = m.toLowerCase();

        generateCipherAlphabet();
    }

    public void generateCipherAlphabet() {
        String alpha = ALPHABET;
        cipherAlphabet = "";
        for (int i = 0; i < 26; i++) {
            int pos = (int)(Math.random() * alpha.length());
            cipherAlphabet += alpha.charAt(pos);
            alpha = alpha.substring(0, pos) + alpha.substring(pos + 1);
        }
    }

    public String encrypt() {
        cipher = "";

        for (int i = 0; i < message.length(); i++) {
            int position = ALPHABET.indexOf(message.charAt(i));
            if (position > -1) {
                cipher += cipherAlphabet.charAt(position);
            }
            else {
                cipher += message.charAt(i);
            }
        }
        cipher = cipher.toUpperCase();

        System.out.println("The cipher alphabet is: " + cipherAlphabet);
        System.out.println("\nThe encoded message is:\n" + cipher);

        return cipher;
    }

    public void writeMessage() throws IOException{
        FileWriter writer = new FileWriter("./message.txt");
        writer.write(cipher+"\n");
        writer.append(cipherAlphabet);
        writer.close();
    }
}