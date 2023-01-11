import java.lang.Math;
import java.util.Scanner;

public class TwentyOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp = "y";

        int wins = 0;
        int losses = 0;

        Player p1 = new Player();
        Player cp = new Player();

        do {
            p1.reset();
            cp.reset();

            System.out.println("Player rolls...");
            System.out.print("Roll (y/n)?: ");

            String playerResp = sc.next();

            while(playerResp.toLowerCase().equals("y")) {
                int roll = p1.roll();
                System.out.printf("You rolled %d. Player score is %d.\n", roll, p1.score);

                if (p1.hasWon() || p1.hasLost()) {
                    break;
                }

                System.out.print("Roll (y/n)?: ");
                playerResp = sc.next();
            }
            if (p1.hasWon()) {
                System.out.println("Player wins.");
                wins++;
            }
            else if (p1.hasLost()) {
                System.out.println("Computer wins.");
                losses++;
            }
            else {
                System.out.println("Computer rolls...");
                while (!(cp.hasWon() || cp.hasLost() || cp.score > p1.score)) {
                    int roll = cp.roll();
                    System.out.printf("Computer rolls %d. Computer score is %d.\n", roll, cp.score);
                }

                if (!cp.hasLost() && cp.score > p1.score) {
                    System.out.println("Computer wins.");
                    losses++;
                }
                else {
                    System.out.println("Player wins.");
                    wins++;
                }
            }

            System.out.print("Play again (y/n)? ");
            resp = sc.next();
        } while (resp.toLowerCase().equals("y"));

        System.out.printf("Player record (W-L): %d-%d\n", wins, losses);
    }
}
