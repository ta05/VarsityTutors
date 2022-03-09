import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Handling {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("./data/nums.txt"));
        int[][] nums = new int[100][10];
        for (int r = 0; r < nums.length; r++) {
            for (int c = 0; c < nums[r].length; c++) {
                nums[r][c] = sc.nextInt();
            }
        }

        for (int[] row : nums) {
            String line = "";
            for (int num : row) {
                line = line + num + " ";
            }
            System.out.println(line.trim());
        }
    }
}