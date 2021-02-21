public class TextBoxTester extends TextBox {
    public static void main(String args[]) {
        System.out.println(textBoxString(5));
        System.out.println(textBoxString(5, '+'));
        System.out.println(textBoxString(4, 3));
        System.out.println(textBoxString(3, 5, 'X', 'O'));
    }
}
