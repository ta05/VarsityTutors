public class Main {
    public static void main(String[] args) {
        System.out.println("Prints out the numbers between 20 and 80 (inclusive) which contain a 3");
        for(int num = 20; num <= 80; num++) {
            String number = num +"";
            if(number.contains("3")) {
                System.out.println(num);
            }
        }

        System.out.println("Prints out the product of two numbers which are divisible by 5");
        for (int num1 = 1; num1 <= 20; num1++) {
            int num2 = 101 - num1;
            int product = num1 * num2;
            if (product % 5 == 0) {
                System.out.println(product);
            }
        }
    }
}
