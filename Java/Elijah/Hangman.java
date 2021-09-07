import java.lang.Math;

public class Hangman {
    private static String[] words = {"apricot", "bandana", "cleverness", "dumbfounded", "electrocuted", "fastidiousness", "garrulous", "hindsight", "intuition", "jocular"}
    private static String answer = words[(int)(Math.random() * words.length)];
    private static int numGuesses = 0;


    public static String initialize() {
        String word = "";
        for(int i = 0; i < answer.length(); i++) {
            word += "_";
        }
        return word;
    }
    public static String checkLetter(String guess, String word) {
        if(answer.contains(guess)) {
            for(int i = 0; i < answer.length(); i++) {
                if(answer.substring(i, i+1).equals(guess)) {
                    word = word.substring(0,i) + guess + word.substring(i+1);
                }
            }
        }
        else {
            numGuesses++;
        }
    }
}
