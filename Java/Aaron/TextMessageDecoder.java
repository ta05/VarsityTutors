import java.util.Scanner;

public class TextMessageDecoder {

    public static void decoder(String statement) {
        Scanner sc2 = new Scanner(statement);

        while (sc2.hasNext()) {
            String word = sc2.next();
            if (word.contains("BFF")) {
                System.out.println("BFF: best friend forever");
            }
            if (word.contains("IDK")) {
                System.out.println("IDK: I don't know");
            }
            if (word.contains("JK")) {
                System.out.println("JK: just kidding");
            }
            if (word.contains("TMI")) {
                System.out.println("TMI: too much information");
            }
            if (word.contains("TTYL")) {
                System.out.println("TTYL: talk to you later");
            }
        }
    }

    public static String expander(String statement) {
        String result = statement;
        result = result.replace("BFF", "best friend forever");
        result = result.replace("IDK", "I don't know");
        result = result.replace("JK", "just kidding");
        result = result.replace("TMI", "too much information");
        result = result.replace("TTYL", "talk to you later");

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");

        String statement = sc.nextLine();

        System.out.println("You entered: " + statement);

        decoder(statement);

        System.out.println("Expanded text: " + expander(statement));

        
    }
}