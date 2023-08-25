import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Anagrams {
    private HashSet<String> anagramSet = new HashSet<String>();

    public Anagrams(String word) {
        findAnagrams(word, "");
    }

    public void findAnagrams(String word, String anagram) {
        if (word.length() <= 1) {
            anagramSet.add(anagram + word);
        }

        for (int i = 0; i < word.length(); i++) {
            findAnagrams(word.substring(0, i) + word.substring(i + 1), anagram + word.charAt(i));
        }
    }

    public ArrayList<String> getAnagrams() {
        ArrayList<String> anagramList = new ArrayList<String>();
        anagramList.addAll(anagramSet);
        Collections.sort(anagramList);
        return anagramList;
    }

    public ArrayList<String> getValidAnagrams(Dictionary dict) {
        ArrayList<String> validAnagramList = getAnagrams();
        for (int i = validAnagramList.size() - 1; i >= 0; i--) {
            if (!dict.getDictionary().contains(validAnagramList.get(i))) {
                validAnagramList.remove(i);
            }
        }
        return validAnagramList;
    }
}