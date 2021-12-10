public class OddAndEven {
    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static int getOddDigitCount(int number) {
        int count = 0;
        while (number > 0) {
            if (isOdd(number)) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    public static int getEvenDigitCount(int number) {
        int count = 0;
        while (number > 0) {
            if (!isOdd(number)) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    public static void main(String[] arg) {
        System.out.println(isOdd(4));
        System.out.println(isOdd(7));

        System.out.println(getOddDigitCount(412));
        System.out.println(getOddDigitCount(425));
        System.out.println(getOddDigitCount(1234));
        System.out.println(getOddDigitCount(9112126));
        System.out.println(getOddDigitCount(1356));

        System.out.println(getEvenDigitCount(412));
        System.out.println(getEvenDigitCount(425));
        System.out.println(getEvenDigitCount(1234));
        System.out.println(getEvenDigitCount(9112126));
        System.out.println(getEvenDigitCount(1356));
    }
}