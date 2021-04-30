public class MagicMatrix {
    public static int[][] calcMagicMatrix(int[] rowHeader, int[] colHeader) {
        int[][] matrix = new int[rowHeader.length][colHeader.length];
        for (int i = 0; i < rowHeader.length; i++)
            for (int j = 0; j < colHeader.length; j++)
                matrix[i][j] = rowHeader[i] * colHeader[j];
        return matrix;
    }
    
    public static void main(String args[]) {
        int[] row = { 2, 4, 6, 8 };
        int[] col = { 3, 6, 9 };

        int[][] matrix = calcMagicMatrix(row, col);

        for (int[] column : matrix) {
            for(int val : column)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}