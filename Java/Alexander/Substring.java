import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

class Substring {
    public static String substringHelper(String str, char open, char close) {
        if (str.length() < 2)
            return "";

        if (str.charAt(0) == open && str.charAt(str.length() - 1) == close)
            return str.substring(1, str.length() - 1);
        else if (str.charAt(0) == open && str.charAt(str.length() - 1) != close)
            return substringHelper(str.substring(0, str.length() - 1), open, close);
        else if (str.charAt(0) != open && str.charAt(str.length() - 1) == close)
            return substringHelper(str.substring(1), open, close);

        return substringHelper(str.substring(1, str.length() - 1), open, close);
    }

    public static void main(String[] args) {
        System.out.println(substringHelper("watermelon", 't', 'o'));
    }
}