import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class DataSource {
    
    private ArrayList<int[]> caloriesList;

    public DataSource(String filename) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("./data/" + filename));
        String text = "";

        String line = bf.readLine();
        while (line != null) {
            text += line + "\n";
            line = bf.readLine();
        }

        String[] caloriesArray = text.split("\n\n");
        caloriesList = new ArrayList<int[]>();

        for (String calories : caloriesArray) {
            String[] calorieArray = calories.split("\n");
            int[] cArray = new int[calorieArray.length];
            for (int i = 0; i < calorieArray.length; i++) {
                cArray[i] = Integer.parseInt(calorieArray[i]);
            }
            caloriesList.add(cArray);
        }
    }

    public int getElfCount() {
        return caloriesList.size();
    }

    public int[] getCalorieArray(int index) {
        return caloriesList.get(index);
    }
}
