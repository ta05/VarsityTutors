public class Tester {
    public static void main(String args[]) {
        PalindromeSearch search = new PalindromeSearch("pushup");

        System.out.println("\"" + search.getWord() + "\" is a palindrome: " + search.isPalindrome());
        System.out.println("\"" + search.getWord() + "\" is nearly a palindrome: " + search.isNearlyPalindrome());
        System.out.println("\"" + search.getWord() + "\" would be a palindrome if you removed a character: " + search.isOffByOnePalindrome());
        System.out.println("The converted palindrome is " + search.convertToPalindrome());
    }
}
