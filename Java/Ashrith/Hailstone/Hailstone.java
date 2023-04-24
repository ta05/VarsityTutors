public class Hailstone {
    // Recursive Solution
    public static int hailstoneLength(int n) {
        // Checks if n is 1
        if (n == 1) {
            return 1;
        }
        // Checks if n is even
        if (n % 2 == 0) {
            return hailstoneLength(n/2) + 1;
        }
        // if n is odd
        return hailstoneLength(3*n + 1) + 1;
    }

    // Iterative Solution
    public static int hailstoneLengthIterative(int n) {
        // Length of the sequence
        int count = 1;
        while (n != 1) {
            // if n is even
            if (n % 2 == 0) {
                n = n / 2;
            }
            // if n is odd
            else {
                n = 3 * n + 1;
            }
            count++;
        }
        return count;
    }

    public static boolean isLongSeq(int n) {
        return hailstoneLength(n) > n;
    }

    public static double propLong(int n) {
        double count = 0;
        for (int i = 1; i <= n; i++) {
            if (isLongSeq(i)) {
                count++;
            }
        }
        return count / n;
    }

    public static void main(String[] args) {
        System.out.println(hailstoneLength(5)); // Prints 6
        System.out.println(hailstoneLength(8)); // Prints 4

        System.out.println(propLong(10));
    }
}
