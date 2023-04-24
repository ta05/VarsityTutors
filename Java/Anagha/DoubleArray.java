import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5};

        System.out.println(arr);

        int[] newArray = doubleArray(arr);

        System.out.println(newArray);
    }

    public static int[] doubleArray(int[] arr) {
        int[] newArray = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            int newArrayIndex1 = i * 2;
            int newArrayIndex2 = i * 2 + 1;

            newArray[newArrayIndex1] = arr[i];
            newArray[newArrayIndex2] = arr[i];
        }

        return newArray;
    }

    public static int[] doubleArray2(int[] arr) {
        int[] newArray = new int[arr.length * 2];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arr[i/2];
        }

        return newArray;
    } 
}