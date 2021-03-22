import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Baby {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String filename = user.nextLine();
        
        Scanner rf = new Scanner(new File("./data/" + filename));

        ArrayList<String> boys = new ArrayList<String>();
        ArrayList<String> girls = new ArrayList<String>();

        while (rf.hasNextLine()) {
            String[] line = rf.nextLine().split("\\s+");

            boys.add(line[1]);
            girls.add(line[3]);
        }

        ArrayList<String> unisex = new ArrayList<String>();
        int matches = 0;

        for (String name : boys) {
            if (girls.contains(name)) {
                matches++;
                unisex.add(name);
            }
        }
        
        System.out.println(matches + " names found in both lists");
        System.out.println(unisex);
    }
}
