import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a calculation");
        String stringNum1 = sc.next();
        String operator = sc.next();
        String stringNum2 = sc.next();

        try {
            Integer.parseInt(stringNum1);
        } catch(Exception e) {
            System.out.println("First input is not an integer");
        }
        try {
            Integer.parseInt(stringNum2);
        } catch(Exception e) {
            System.out.println("Second input is not an integer");
        }
        try {
            ArrayList<String> operators = new ArrayList<String>(Arrays.asList("+", "-", "*", "/"));
            operators.get(operators.indexOf(operator));
        } catch (Exception e) {
            System.out.println("Invalid operator");
        }
        
        int num1 = Integer.parseInt(stringNum1);
        int num2 = Integer.parseInt(stringNum2);


        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            
            case "-":
                System.out.println(num1 - num2);
                break;
            
            case "*":
                System.out.println(num1 * num2);
                break;
            
            case "/":
                System.out.println(num1 / num2);
                break;
            
            default:
                break;
        }
    }
}