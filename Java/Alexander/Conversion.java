class Conversion {
    public static String decimalToBinary(int value) {
        if (value == 0)
            return "";
        return decimalToBinary(value / 2) + value % 2;
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(256));
    }
}