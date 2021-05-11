import java.util.ArrayList;

public class Review1 {
    public ArrayList<Integer> underVal(ArrayList<Integer> arr, int min) {
        for(int i = 0; i < arr.size() i++)
            if(arr.get(i) < min) {
                arr.remove(i);
                i++;
            }
        return arr;
    }
}
