public class TextBox {
    
    // The returned String value, when printed, displays a square of "*"
    public static String textBoxString(int side) {
        String s = "";
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++)
                s += "*";
            s += "\n";
        }
        return s.trim();
    }

    // The returned String value, when printed, displays, the outline of a square of side bChar characters
    public static String textBoxString(int side, char bChar) {
        String s = "";
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++)
                if (i == 0 || i == side - 1 || j == 0 || j == side - 1)
                    s += bChar;
                else
                    s += " ";
            s += "\n";
        }
        return s.trim();
    }

    // The returned String value, when printed, displays, the outline of a rectangle of size row x cols of "*"
    public static String textBoxString(int rows, int cols) {
        String s = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1)
                    s += "*";
                else
                    s += " ";
            s += "\n";
        }
        return s.trim();
    }

    // The returned String value, when printed, displays the outline of a rectangle of rows rows and cols columns using 
    // alternating c1 and c2 characters. Note that the first printed character should be c1, and every other printed character should be c1. 
    // The second printed character should be c2, and every other printed character should be c2.
    // For example, in the example below, the end of the first line is 'x' and the beginning of the second line is 'o'.
    // The next printed character, at the end of the second line is 'x'.
    public static String textBoxString(int rows, int cols, char c1, char c2) {
        String s = "";
        boolean addC1 = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    if (addC1)
                        s += c1;
                    else
                        s += c2;
                    addC1 = !addC1;
                } 
                else
                    s += " ";
            s += "\n";
        }
        return s.trim();
    }
}