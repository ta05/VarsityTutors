public class CaesarShiftEncryption {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static int shift;

    public CaesarShiftEncryption(int shift) {
        CaesarShiftEncryption.shift = shift;
    }

    public static String getAlphabet() {
        String doubleAlphabet = ALPHABET + ALPHABET;
        String encryptAlphabet = "";
        for (int i = shift; i < shift + 26; i++) {
            encryptAlphabet += doubleAlphabet.charAt(i);
        }

        return encryptAlphabet;
    }

    public static String encrypt(String plainText) {
        String finalText = "";
        String encryptAlpha = getAlphabet();
        for (int i = 0; i < plainText.length(); i++) {
            int index = ALPHABET.indexOf(plainText.charAt(i));
            if (index >= 0) {
                finalText += encryptAlpha.charAt(index);
            }
            else {
                finalText += plainText.charAt(i);
            }
        }
        return finalText;
    }
}
