import java.util.Scanner;

public class RPS {
    public static void main(String args[]) {
        int score1 = 0;
        int score2 = 0;
        String choices[] = { "Rock", "Paper", "Scissors" };

        Scanner sc = new Scanner(System.in);

        while (score1 < 2 && score2 < 2) {
            System.out.println("Pick a number:\n\n1. Rock\n2. Paper\n3. Scissors\n");

            System.out.print("Player 1: ");
            int choice1 = sc.nextInt();

            System.out.print("Player 2: ");
            int choice2 = sc.nextInt();

            System.out.println();

            switch (choices[choice1-1]) {
                case "Rock":
                    switch (choices[choice2-1]) {
                        case "Rock":
                            System.out.println("Rock ties Rock");
                            break;
                        case "Paper":
                            System.out.println("Rock loses to Paper");
                            score2++;
                            break;
                        case "Scissors":
                            System.out.println("Rock beats Scissors");
                            score1++;
                            break;
                        default:
                            break;
                    }
                    break;
                case "Paper":
                    switch (choices[choice2 - 1]) {
                        case "Rock":
                            System.out.println("Paper beats Rock");
                            score1++;
                            break;
                        case "Paper":
                            System.out.println("Paper ties Paper");
                            break;
                        case "Scissors":
                            System.out.println("Paper loses to Scissors");
                            score2++;
                            break;
                        default:
                            break;
                    }
                    break;
                case "Scissors":
                    switch (choices[choice2 - 1]) {
                        case "Rock":
                            System.out.println("Scissors loses to Rock");
                            score2++;
                            break;
                        case "Paper":
                            System.out.println("Scissors beats Paper");
                            score1++;
                            break;
                        case "Scissors":
                            System.out.println("Scissors ties Scissors");
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
            System.out.println("Score: " + score1 + "-" + score2 + "\n");
        }
        System.out.println(score1 > score2 ? "Player 1 Wins!" : "Player 2 Wins!");
    }
}
