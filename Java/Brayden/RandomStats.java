import java.lang.Math;

public class RandomStats {
    public static void main(String[] args) {
        int[] digitCount = new int[10];
        for (int i = 0; i < 500; i++)
            digitCount[(int) (Math.random() * 10)]++;
        System.out.println("Number\tOccurences");
        for(int j = 0; j < digitCount.length; j++)
            System.out.println(j + "\t" + digitCount[j]);
    }
}
