import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        sc.close();

        int counter = 0;
        while (counter < num) {
            System.out.print(counter + " ");
            counter += 2;
        }
    }
}
