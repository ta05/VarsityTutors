import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bookshelf {
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<Book> books = new ArrayList<Book>();
        Scanner sc = new Scanner(new File("./data/data.txt"));

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] row = line.split(",\\s+");

            String title = row[0];
            String author = row[1];
            int pubYear = Integer.parseInt(row[2]);
            int pages = Integer.parseInt(row[3]);
            int medium = Integer.parseInt(row[4]);
            int numPrinted = Integer.parseInt(row[5]);
            int cost = Integer.parseInt(row[6]);
            double price = Double.parseDouble(row[7]);
            int numSold = Integer.parseInt(row[8]);
            int positiveReviews = Integer.parseInt(row[9]);
            int negativeReviews = Integer.parseInt(row[10]);

            if (row.length == 12) {
                String genre = row[11];
                Novel n = new Novel(title, author, pubYear, pages, medium, numPrinted, cost, price, numSold, positiveReviews, negativeReviews, genre);
                books.add(n);
            }
            else if (row.length == 13) {
                String field = row[11];
                String topic = row[12];
                Textbook t = new Textbook(title, author, pubYear, pages, medium, numPrinted, cost, price, numSold, positiveReviews, negativeReviews, field, topic);
                books.add(t);
            }
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
