import java.lang.Math;
import java.util.ArrayList;

public class BabysitterService {
    private ArrayList<Babysitter> sitterList;

    public BabysitterService(Babysitter[] sitters) {
        sitterList = new ArrayList<Babysitter>();
        for (Babysitter sitter : sitters) {
            sitterList.add(sitter);
        }
    }

    // Part a
    public void addNewSitters(String[] names) {
        for (String name : names) {
            for (int i = 0; i < sitterList.size(); i++) {
                if (name.equals(sitterList.get(i).getName())) {
                    break;
                }
                if (i == sitterList.size() - 1) {
                    Babysitter newSitter = new Babysitter(name, 0);
                    sitterList.add(newSitter);
                    break;
                }
            }
        }
    }

    // Part b
    public ArrayList<Babysitter> affordableSitters (double budget, int numChildren, int hours) {
        ArrayList<Babysitter> sitters = new ArrayList<Babysitter>();
        for (Babysitter sitter : sitterList) {
            int rate = Math.min(2 + sitter.getYears(), 6);
            if (rate * numChildren * hours <= budget) {
                sitters.add(sitter);
            }
        }
        return sitters;
    }
}
