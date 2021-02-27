import java.util.Scanner;

public class Assignment3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string");
        String s1 = sc.nextLine();

        System.out.println("Please enter another string");
        String s2 = sc.nextLine();

        String options = "Command Options\n" + 
        "-----------------------------------\n" +
        "Option a: checks if the length of the two strings are the same.\n" +
        "Option b: checks if two strings are the same or different.\n" +
        "Option c: checks which string is lexically larger, or if they are the same\n" +
        "Option d: prints out the first character (index 0) of each string\n" +
        "Option e: prints out a new string consisting of the first string concatenated (appended) with the second string.\n" +
        "Option f: prints out two strings using upper case letters.\n" +
        "Option q: quit the program.\n";

        System.out.println(options);

        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("Please enter an option from the menu");
            String choice = sc.nextLine();

            switch (choice.toLowerCase()) {
                case "a":
                    if (s1.length() == s2.length())
                        System.out.println("The lengths are the same");
                    else
                        System.out.println("The lengths are not the same");
                    break;
                case "b":
                    if (s1.equals(s2))
                        System.out.println("The strings are the same");
                    else
                        System.out.println("The strings are different");
                case "c":
                    if (s1.compareTo(s2) < 0)
                        System.out.println("The second string is lexically larger");
                    else if (s1.compareTo(s2) > 0)
                        System.out.println("The first string is lexically larger");
                    else
                        System.out.println("Neither string is lexically larger");
                    break;
                case "d":
                    System.out.println("The first character of the first string is " + s1.charAt(0));
                    System.out.println("The second character of the second string is " + s2.charAt(0));
                    break;
                case "e":
                    System.out.println("The concatenation of the two strings is \"" + s1 + s2 + "\"");
                    break;
                case "f":
                    System.out.println("The first string using uppercase is " + s1.toUpperCase());
                    System.out.println("The second string using uppercase is " + s2.toUpperCase());
                    break;
                case "q":
                    shouldContinue = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
