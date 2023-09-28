import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine().toLowerCase();

        sc.close();

        String lettersSeen = "";

        for (int i = 0; i < word.length(); i++) {
            if (!lettersSeen.contains(word.substring(i, i + 1))) {
                lettersSeen += word.charAt(i);
                int count = 1;
                for (int j = i + 1; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(word.charAt(i) + ": " + count);
            }
        }
    }

}
