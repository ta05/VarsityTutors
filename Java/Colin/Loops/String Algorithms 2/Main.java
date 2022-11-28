import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("One character per line:");
        oneCharacterPerLine(str);

        
        System.out.println("Every other character:");
        everyOtherCharacter(str);

        System.out.println("Only vowels:");
        System.out.println(onlyVowels(str));

        System.out.println("Number of times \"on\" appears:");
        System.out.println(onAppearances(str));
    }

    public static void oneCharacterPerLine(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                System.out.println(str.charAt(i));
            }
        }
    }

    public static void everyOtherCharacter(String str) {
        for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
        System.out.println("");
    }

    public static String onlyVowels(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if ("aeiou".contains(""+Character.toLowerCase(character))) {
                result += character;
            }
        }
        return result;
    }
    public static int onAppearances(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i+2).equals("on")) {
                count++;
            }
        }
        return count;
    }
}
