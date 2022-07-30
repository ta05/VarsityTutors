import java.util.Stack;
import java.util.Queue;

public class Palindrome {
    public static String removePunctuation(String str) {
        return str.replaceAll("\\p{Punct}", "");
    }
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }
    public static boolean isPalindrome(String str) {
        Stack<Character> firstHalf = new Stack<Character>();
        Stack<Character> secondHalf = new Stack<Character>();
        str = removePunctuation(removeWhitespace(str)).toLowerCase();
        int mid = str.length()/2;
        if (str.length() % 2 == 1) {
            str = str.substring(0, mid) + str.substring(mid + 1);
        }
        
        for (int i = 0; i < mid; i++) {
            firstHalf.push(str.charAt(i));
            secondHalf.push(str.charAt(str.length() - 1 - i));
        }
        
        while (!firstHalf.isEmpty()) {
            if (firstHalf.pop() != secondHalf.pop()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("A man, a plan, a canal, Panama!"));
        System.out.println(isPalindrome("infrared"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("I"));
    }
}
