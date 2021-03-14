import java.util.ArrayList;
import java.util.function.IntFunction;
import java.lang.Math;

public class SortSearch {
    private ArrayList<Integer> original;
    private ArrayList<Integer> temp = new ArrayList<Integer>();

    public SortSearch() {
        original = new ArrayList<Integer>();
        for(int i = 0; i < 50; i++)
            original.add((int) (Math.random() * 100 + 1));
        for(int num : original)
            temp.add(num);
    }

    public boolean linearSearch(int target) {
        int steps = 0;
        for (int i = 0; i < original.size(); i++) {
            steps++;
            if (original.get(i) == target) {
                System.out.println("Found the target in " + steps + " searches.");
                return true;
            }

        }
        System.out.println(target + " was not found");
        return false;
    }

    public void selectionSort() {
        int steps = 0;
        for (int i = 0; i < original.size() - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < original.size(); j++) {
                steps++;
                if (original.get(j) < original.get(min_index))
                    min_index = j;
            }
            int minElement = original.get(min_index);
            original.set(min_index, original.get(i));
            original.set(i, minElement);
        }
        System.out.println("Selection Sort: " + steps + " steps");
        System.out.println(original);
    }

    public void insertionSort() {
        int steps = 0;
        for (int i = 1; i < original.size(); i++) {
            for (int j = 0; j < i; j++) {
                steps++;
                if (original.get(i) < original.get(j)) {
                    original.add(j, original.remove(i));
                    break;
                }
            }
        }
        System.out.println("Insertion Sort: " + steps + " steps");
        System.out.println(original);
    }

    public boolean binarySearch(int target) {
        int steps = 0;
        int min = 0;
        int max = original.size() - 1;
        int guess;
        while (min <= max) {
            steps++;
            guess = (int)(Math.floor((max + min) / 2));
            if (original.get(guess) == target) {
                System.out.println("Found the target in " + steps + " searches.");
                return true;
            } else if (original.get(guess) < target) {
                min = guess + 1;
            } else {
                max = guess - 1;
            }
        }
        System.out.println(target + " was not found");
        return false;
    }

    public void rebuild() {
        original = temp;
    }
}
