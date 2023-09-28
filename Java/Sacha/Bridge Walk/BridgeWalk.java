import java.lang.Math;
import java.util.Scanner;

public class BridgeWalk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to The Bridge Walk\n");
        System.out.println("This program will run 50 trials on a requested bridge size and report back the average number of steps needed to fall off. Only input odd numbers please or you will get nothing. The first trial is shown with the illustration, the rest are not shown.\n");

        System.out.print("What size bridge would you like to test (3-21 recommend): ");
        int size = sc.nextInt();
        sc.close();

        double avg = bridgeSimulation(size);
        System.out.printf("The average number of steps was: %.1f\n", avg);

        System.out.println("\nThank you for using my program.");
    }

    public static void display(int step, int location, int size) {
        String bridge = "";
        for (int i = 0; i < size; i++) {
            if (location == i) {
                bridge += "*";
            }
            else {
                bridge += "-";
            }
        }
        System.out.println("Step: " + step + " |" + bridge + "|");
    }

    public static int calculateLocation(int location) {
        return Math.random() < 0.5 ? location - 1 : location + 1;
    }

    public static int oneSimulation(int size, boolean print) {
        int step = 0;
        int location = size / 2;
        do {
            if (print) {
            display(step, location, size);

            }
            step++;
            location = calculateLocation(location);
        } while (location >= 0 && location < size);

        if (print) {
            display(step, location, size);
            System.out.println("\nThey fell off.");
        }
        
        return step;
    }

    public static double bridgeSimulation(int size) {
        int totalSteps = 0;
        for (int i = 0; i < 50; i++) {
            totalSteps += oneSimulation(size, i==0);
        }
        return totalSteps/50.0;
    }
}