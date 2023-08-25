import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Dictionary {
    private ArrayList<String> dictionary = new ArrayList<String>();

    public Dictionary() throws Exception {
        URL url = new URL("https://docs.oracle.com/javase/tutorial/collections/interfaces/examples/dictionary.txt");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(url.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            dictionary.add(inputLine);
        in.close();
    }

    public ArrayList<String> getDictionary() {
        return dictionary;
    }
}
