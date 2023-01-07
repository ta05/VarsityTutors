import java.io.IOException;
import java.lang.Math;

public class Main {
    public static int sumArray(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) throws IOException {
        DataSource ds = new DataSource("calories.txt");
        
        int mostCalories = 0;

        for (int i = 0; i < ds.getElfCount(); i++) {
            mostCalories = Math.max(mostCalories, sumArray(ds.getCalorieArray(i)));
        }

        System.out.println("The Elf with the most calories is holding " + mostCalories + " calories.");
    }
}
