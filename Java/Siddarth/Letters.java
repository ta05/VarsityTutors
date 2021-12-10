public class Letters {
    
    public static String getLetters(int howMany, String thatLetter) {
        String res = "";
        for (int i = 0; i < howMany; i++) {
            res += thatLetter;
        }
        return res;
    }

    public static String getLetterTriangle(int numRows, String triLetter) {
        String result = "";
        for (int i = 0; i < numRows; i++) {
            result += getLetters(numRows - (i + 1), " ") + getLetters(i + 1, triLetter);
            if (i < numRows - 1) {
                result += "\n";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getLetters(4, "e"));
        System.out.println(getLetters(7, "W"));
        System.out.println(getLetters(3, " "));
        System.out.println(getLetters(6, "8"));
        System.out.println(getLetters(11, "X"));

        System.out.println(getLetterTriangle(4, "U"));
        System.out.println(getLetterTriangle(5, "W"));
    }
}
