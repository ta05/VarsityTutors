import java.util.ArrayList;

public class NumberAnalyzer {
    private ArrayList<Number> nums;

    public NumberAnalyzer(int[] numbers) {
        nums = new ArrayList<Number>();
        for (int number : numbers) {
            nums.add(new Number(number));
        }
    }

    public int countOdds() {
        int count = 0;
        for (Number num : nums) {
            if (num.isOdd()) {
                count++;
            }
        }
        return count;
    }

    public int countEvens() {
        return nums.size() - countOdds();
    }

    public int countPerfects() {
        int count = 0;
        for (Number num : nums) {
            if (num.isPerfect()) {
                count++;
            }
        }
        return count;
    }

    public String toString() {
        return "" + nums;
    }
}
