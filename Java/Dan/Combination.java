public class Combination {
    public static int getFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }

    public static int getCombination(int n, int r) {
        return getFactorial(n) / (getFactorial(r) * getFactorial(n - r));
    }

    public static void main(String args[]) {
        System.out.println(getFactorial(5));
        System.out.println(getCombination(7, 3));
    }
}