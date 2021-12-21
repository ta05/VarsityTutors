import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an expression:");
        String expression = sc.next();
        sc.close();

        String[] numbers = expression.split("[+-\\/%*]");
        int answer;

        if (expression.contains("+")) {
            answer = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
            System.out.println("The answer is " + answer);
        }
        else if (expression.contains("-")) {
            answer = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
            System.out.println("The answer is " + answer);
        }
        else if (expression.contains("*")) {
            answer = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
            System.out.println("The answer is " + answer);
        }
        else if (expression.contains("/")) {
            answer = Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
            System.out.println("The answer is " + answer);
        }
        else if (expression.contains("%")) {
            answer = Integer.parseInt(numbers[0]) % Integer.parseInt(numbers[1]);
            System.out.println("The answer is " + answer);
        }
        else {
            System.out.println("The expression is invalid");
        }
    }
}
