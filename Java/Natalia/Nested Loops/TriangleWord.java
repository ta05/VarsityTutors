public class TriangleWord {
    private String word;

    public TriangleWord(String word) {
        this.word = word;
    }

    public void setTriangleWord(String word) {
        this.word = word;
    }

    public String toString() {
        String output = "";

        // Go through every row except last row of the triangle
        for (int r = 0; r < word.length() - 1; r++) {

            // Add spaces before the left side of the triangle
            for (int spacesLeft = word.length() - (r + 1); spacesLeft > 0; spacesLeft--) {
                output += " ";
            }

            // Add the letter at index r for left side of triangle
            output += word.charAt(r);

            // Add spaces inside the triangle
            for (int spacesBetween = 2 * r - 1; spacesBetween > 0; spacesBetween--) {
                output += " ";
            }

            // Add right side of triangle (first letter is a vertex, taken care of on the left side)
            if (r != 0) {
                output += word.charAt(r);
            }

            // Go to next line
            output += "\n";
        }

        // Base of the triangle is the word backwards and then forwards, sharing the first letter of the word
        // Add the word backwards
        for (int i = word.length() - 1; i >= 0; i--) {
            output += word.charAt(i);
        }

        // Add the word excluding the first letter
        output += word.substring(1);

        return output;
    }
}
