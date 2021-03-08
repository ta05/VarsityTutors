import java.util.ArrayList;

public class Practice {
    public static int method0501(int n) {
        int[] temp = new int[n];
        temp[0] = 1;
        temp[1] = 3;
        for (int k = 2; k < n; k++)
            temp[k] = temp[k - 1] + temp[k - 2];
        return temp[n - 1];
    }

    public static int[][] method0507(int n) {
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                m[i][j] = i + j;
                m[j][i] = j - i;
            }
        }
        return m;
    }

    public static ArrayList<Integer> method0516() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(new Integer(1));
        nums.add(new Integer(2));
        nums.add(new Integer(3));

        ArrayList<Integer> odd = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i += 2)
            odd.add(nums.get(i));
        return odd;
    }

    public static void method0524(int[] arr, int len) {
        for(int i = 0; i < len; i++)
            arr[i]--;
        len--;
    }
    
    public static void main(String[] args) {
        // Question 1
        System.out.println("Question 1");
        System.out.println(method0501(10));
        
        // Question 7
        System.out.println("\nQuestion 7");
        int[][] matrix = method0507(5);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // Question 16
        System.out.println("\nQuestion 16");
        System.out.println(method0516());

        // Question 24
        System.out.println("\nQuestion 24");
        int[] arr = { 3, 2, 1, 0, 0, 0 };
        int len = 3;
        method0524(arr, len);
        for(int num : arr)
            System.out.print(num + " ");
        System.out.println("\n" + len);
    }
}