public class isPalindrome {
    public static boolean isPalindrome(String str) {
        return isPalindromeHelper(str, 0, str.length() - 1);
    }

    public static boolean isPalindromeHelper(String str, int start, int end) {
        if (start >= end)
            return true;
        if (str.charAt(start) == str.charAt(end))
            return isPalindromeHelper(str, start+1, end-1);
        else
            return false;
    }
    
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome("123123"));
        System.out.println(isPalindrome("hannah"));
        System.out.println(isPalindrome("race car"));
    }
    
}
