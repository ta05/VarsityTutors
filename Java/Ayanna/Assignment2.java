public class Assignment2 {
    public static void main(String args[]) {
        char letter = 'c';
        switch (Character.toLowerCase(letter)) {
            case 'a':
            case 'b':
                System.out.println("You did very well!");
                break;
            case 'c':
            case 'd':
                System.out.println("You could use some improvement.");
                break;
            default:
                System.out.println("Oh no...");
                break;
        }
    }
}
