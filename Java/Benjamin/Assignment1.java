import java.util.Scanner;

public class Assignment1 {
    
    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
    
    public static void main(String args[]) {
        int vowelCounter = 0;
        int consCounter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word, sentence or phrase");
        String text = sc.nextLine().toLowerCase();
        int charSaved = text.length();
        sc.close();
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (j != 0 && isVowel(words[i].charAt(j))) {
                    words[i] = words[i].substring(0, j) + words[i].substring(j + 1);
                    vowelCounter++;
                    j--;
                } else if (j < words[i].length() - 1 && words[i].charAt(j) == words[i].charAt(j + 1)) {
                    words[i] = words[i].substring(0, j + 1) + words[i].substring(j + 2);
                    consCounter++;
                }
            }
        }
        
        System.out.println(String.join(" ", words));
        System.out.println("The number of vowels removed: " + vowelCounter);
        System.out.println("The number of repeating consonants removed: " + consCounter);
        charSaved -= (vowelCounter + consCounter);
        System.out.println("The number of characters saved: " + charSaved);

    }
}
