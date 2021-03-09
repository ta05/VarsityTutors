public class nOrMore {
    public static boolean nOrMore(String str, char target, int n) {
        return nOrMoreHelper(str, target, n, 0, 0);
    }

    public static boolean nOrMoreHelper(String str, char target, int n, int index, int count) {
        if (count == n)
            return true;
        if (str.length() == index)
            return false;
        if (str.charAt(index) == target)
            return nOrMoreHelper(str, target, n, index + 1, count + 1);
        else
            return nOrMoreHelper(str, target, n, index + 1, count);
    }
    
    public static void main(String[] args) {
        System.out.println(nOrMore("123123123", '1', 3));
        System.out.println(nOrMore("abcba", 'c', 2));
        System.out.println(nOrMore("AAAAA", 'A', 2));
        System.out.println(nOrMore("Ghastly", 'z', 1));
        System.out.println(nOrMore("", 'z', 0));
    }
}
