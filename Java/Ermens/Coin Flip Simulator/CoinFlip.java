import java.lang.Math;

public class CoinFlip {
    public static void main(String[] args) {
        int flips = 50;
        
        int longestRun = 0;
        int currentRun = 0;
        int[] numRuns = new int[flips]; // Holds the number of runs of index length at each index

        System.out.println("***** Coin Flip Simulation *****");
        for (int i = 0; i < flips; i++) {
            if (Math.random() <= 0.5) {
                System.out.print("H");
                currentRun++;
            }
            else {
                System.out.print("T");
                longestRun = Math.max(longestRun, currentRun);
                numRuns[currentRun]++;
                currentRun = 0;
            }
        }
        longestRun = Math.max(longestRun, currentRun);

        System.out.println("\n\nheads# count");

        for (int i = 1; i <= longestRun; i++) {
            System.out.println(i + "\t" + numRuns[i]);
        }
    }
}
