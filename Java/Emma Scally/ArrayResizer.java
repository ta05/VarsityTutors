public class ArrayResizer {
    public static boolean isNonZeroRow(int[][] mat, int row) {
        for (int col = 0; col < mat[row].length; col++) {
            if (mat[row][col] == 0) {
                return false;
            }
        }
        return true;
    }

    public static int numNonZeroRows(int[][] mat) {
        int count = 0;
        for (int row = 0; row < mat.length; row++) {
            if (isNonZeroRow(mat, row)) {
                count++;
            }
        }
        return count;
    }

    public static int[][] resize(int[][] mat) {
        int i = 0;
        int[][] smaller = new int[numNonZeroRows(mat)][mat[0].length];
        for (int row = 0; row < mat.length; row++) {
            if (isNonZeroRow(mat, row)) {
                smaller[i] = mat[row];
                i++;
            }
        }
        return smaller;
    }

    public static void main(String[] args) {
        int[][] mat = { { 0, 0, 0 }, { 2, 1, 3 }, { 5, 0, 6 }, { 8, 7, 4 } };
        int[][] smaller = resize(mat);
        for (int[] row : smaller) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
