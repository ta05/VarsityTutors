public class CaesarShiftDecryption {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static int shift;

    public CaesarShiftDecryption(int shift) {
        CaesarShiftDecryption.shift = (-1 * shift + 26);
    }

    public static String getAlphabet() {
        String doubleAlphabet = ALPHABET + ALPHABET;
        String decryptAlphabet = "";
        for (int i = shift; i < shift + 26; i++) {
            decryptAlphabet += doubleAlphabet.charAt(i);
        }

        return decryptAlphabet;
    }

    public static String decrypt(String plainText) {
        String finalText = "";
        String decryptAlpha = getAlphabet();
        for (int i = 0; i < plainText.length(); i++) {
            int index = ALPHABET.indexOf(plainText.charAt(i));
            if (index >= 0) {
                finalText += decryptAlpha.charAt(index);
            }
            else {
                finalText += plainText.charAt(i);
            }
        }
        return finalText;
    }
}
