public class Recursion {
    public static int recursiveFibonacci(int num) {
        if (num < 3) {
            return 1;
        }
        return recursiveFibonacci(num - 1) + recursiveFibonacci(num - 2);
    }

    public static int iterativeFibonacci(int num) {
        int last = 0;
        int secondToLast = 0;
        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                last = 1;
            }
            else {
                int temp = last + secondToLast;
                secondToLast = last;
                last = temp;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        System.out.println(recursiveFibonacci(10));
        System.out.println(iterativeFibonacci(10));
    }
}
