import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word, phrase or sentence.");
        String text = sc.nextLine().toLowerCase();
        sc.close();
        HashMap<Character, Integer> letterCount = new HashMap<Character, Integer>();
        ArrayList<Character> uniqueCharacters = new ArrayList<Character>();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                if (!letterCount.containsKey(text.charAt(i))) {
                    uniqueCharacters.add(text.charAt(i));
                    letterCount.put(text.charAt(i), 1);
                }
                else
                    letterCount.put(text.charAt(i), letterCount.get(text.charAt(i)) + 1);
            }
        }
        String res = "";
        for(char letter : uniqueCharacters) {
            res += letterCount.get(letter) + "" + letter;
        }

        System.out.println(res);
    }
    
}
