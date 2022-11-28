public class Main {
    public static void main(String[] args) {
        printByWord("HelloWorld");
        printByWord("");
        printByWord("ABC DEF");
        System.out.println(noSpaces("You may begin."));
        System.out.println(noSpaces(""));
        System.out.println(noSpaces("ABC"));
        System.out.println(noSpaces("A P C S A"));
        System.out.println(reverse("You may begin."));
        System.out.println(reverse(""));
        System.out.println(reverse("ABC"));
        System.out.println(reverse("A P C S A"));
    }

    public static void printByWord(String str) {
        for (int i = 1; i < str.length() + 1; i++) {
            System.out.println(str.substring(0, i));
        }
    }

    public static String noSpaces(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (character != ' ') {
                newString += character;
            }
        }
        return newString;
    }

    public static String reverse(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            newString = str.charAt(i) + newString;
        }
        return newString;
    }
}
