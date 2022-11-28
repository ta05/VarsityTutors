public class CoolNumbers {
    
    public static boolean isCoolNumber(int num) {
        return num % 3 == 1 && num % 4 == 1 && num % 5 == 1 && num % 6 == 1;
    }

    public static int countCoolNumbers(int stop) {
        if (stop < 7) {
            return -1;
        }

        int count = 0;
        for (int i = 7; i <= stop; i++) {
            if (isCoolNumber(i)) {
                count++;
            }
        }
        return count;
    }
}
