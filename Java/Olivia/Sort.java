public class Sort {
    public static void sort(int[] arr) {
        int shuffle = 0;
        int insert = 0;
        for (int j = arr.length - 2; j >= 0; j--) {
            int move = arr[j];
            int k = j + 1;
            while (k < arr.length && move > arr[k]) {
                arr[k - 1] = arr[k]; /* Shuffle elements upwards */
                shuffle++;
                k++;
            }
            arr[k - 1] = move; /* Insert value into position */
            insert++;
        }
        System.out.println("Shuffle is called " + shuffle + " time(s)");
        System.out.println("Insert is called " + insert + " time(s)");
    }

    public static void main(String args[]) {
        int[] arr = { 5, 4, 3, 2 };
        sort(arr);
    }
}
