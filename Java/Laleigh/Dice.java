import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        dice();
    }

    private static void dice() {
        /*
         * Ask the user how many sides does the dice have
         * Simulate rolling the dice by generating a random number
         * Roll the dice three times
         * Display each roll and display the total of all rolls
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("How many sides are on the die: ");
        int sides = sc.nextInt();
        int roll, total = 0;
        for (int i = 0; i < 3; i++) {
            roll = (int)(Math.random() * sides + 1);
            System.out.printf("You rolled a %d\n", roll);
            total += roll;
        }

        System.out.printf("The total of your rolls is %d\n", total);
    }
}