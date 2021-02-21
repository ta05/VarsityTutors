import java.util.ArrayList;

public class Search {
    public static int search(ArrayList<String> list, String target) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        ArrayList<String> vals = new ArrayList<String>();
        vals.add("define");
        vals.add("explain");
        vals.add("justify");
        vals.add("explain");
        vals.add("determine");
        vals.add("justify");
        System.out.println(search(vals, "explain"));
    }
}
