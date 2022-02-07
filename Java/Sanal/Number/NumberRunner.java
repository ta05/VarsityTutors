public class NumberRunner {
    public static void main(String[] args) {
        int[] nums = {7, 28, 496, 1111, 199, 201, 17};
        for (int num : nums) {
            Number n = new Number(num);
            if (n.isOdd()) {
                System.out.println(n + " is odd.");
            }
            else {
                System.out.println(n + " is even.");
            }
            if (n.isPerfect()) {
                System.out.println(n + " is perfect.");
            }
            else {
                System.out.println(n + " is not perfect.");
            }
        }
    }
}
