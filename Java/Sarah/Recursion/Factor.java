import java.util.ArrayList;
import java.util.List;

public class Factor {
    public static List<Integer> factor(int n) {
        List<Integer> factors = new ArrayList<Integer>();
        return factorHelper(n, 1, factors);
    }

    private static List<Integer> factorHelper(int n, int factor, List<Integer> factors) {
        if (n == factor) {
            factors.add(factor);
            return factors;
        }
        if (n % factor == 0) {
            factors.add(factor);
        }

        return factorHelper(n, factor + 1, factors);
    }

    public static void main(String[] args) {
        System.out.println(factor(48));
    }
}