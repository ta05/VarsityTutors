public class Number {
    private int num;

    public Number(int number) {
        num = number;
    }

    public int getNum() {
        return num;
    }

    public boolean isOdd() {
        return num % 2 == 1;
    }

    public boolean isEven() {
        return !isOdd();
    }

    public boolean isPerfect() {
        int sum = 0;
        for(int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public String toString () {
        return "" + num;
    }
}
