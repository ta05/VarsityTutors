import java.util.Arrays;

public class DiverseArray {
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int[] rowSums(int[][] mat) {
        int[] sums = new int[mat[0].length];
        for (int i = 0; i < sums.length; i++) {
            sums[i] = arraySum(mat[i]);
        }
        return sums;
    }

    public static boolean isDiverse(int[][] mat) {
        int[] sums = rowSums(mat);
        Arrays.sort(sums);
        for (int i = 0; i < sums.length - 1; i++) {
            if (sums[i] == sums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}