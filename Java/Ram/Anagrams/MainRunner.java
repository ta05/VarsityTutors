import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) throws Exception {
        Dictionary dict = new Dictionary();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        Anagrams anagrams = new Anagrams(word);

        System.out.println("Here are the all the anagrams of " + word + ": " + anagrams.getAnagrams());

        System.out.println("Here are all the anagrams of " + word + " which appear in the dictionary: " + anagrams.getValidAnagrams(dict));
    }
}
