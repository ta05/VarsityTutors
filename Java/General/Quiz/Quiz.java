import java.lang.Math;
import java.util.Scanner;

public class Quiz {
    public static int[] stringToIntArray(String[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = Integer.parseInt(arr[i]);
        }
        return newArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter key: ");
        int[] key = stringToIntArray(sc.nextLine().split(" "));

        String resp = "";

        do {
            System.out.print("Enter answers: ");
            int[] answers = stringToIntArray(sc.nextLine().split(" "));

            int numCorrect = 0;
            for (int i = 0; i < key.length; i++) {
                if (key[i] == answers[i]) {
                    numCorrect++;
                }
            }
            int avg = (int)(Math.round((numCorrect * 1.0)/key.length * 100));
            System.out.printf("The student got %d/%d correct, receiving a grade of %d%%.\n\n", numCorrect, key.length, avg);

            System.out.print("Grade another quiz? (y/n) ");
            resp = sc.next().substring(0).toLowerCase();
            sc.nextLine();
        } while (resp.equals("y"));
    }
}
