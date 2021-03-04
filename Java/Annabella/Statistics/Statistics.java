import java.util.Arrays;
import java.lang.Math;

public class Statistics {
    public int[] createList(int n) {
        int[] numArray = new int[n];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (Math.random() * 90 + 10);
        }
        return numArray;
    }

    public double getMean(int[] list) {
        double sum = 0;
        for (int num : list)
            sum += num;
        return sum / list.length;
    }

    public static void sortList(int[] list) {
        Arrays.sort(list);
    }

    public int getMode(int[] list) {
        sortList(list);

        int currValue = 0;
        int currFreq = 0;
        int maxValue = 0;
        int maxFreq = 0;

        for (int num : list) {
            if (currValue == num) {
                currFreq++;
            } else {
                currValue = num;
                currFreq = 1;
            }

            if (currFreq > maxFreq) {
                maxFreq = currFreq;
                maxValue = currValue;
            }
        }

        return maxValue;
    }
}