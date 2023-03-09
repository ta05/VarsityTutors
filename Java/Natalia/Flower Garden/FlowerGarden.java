import java.util.ArrayList;

public class FlowerGarden {
    private ArrayList<String> garden;

    public FlowerGarden() {
        garden = new ArrayList<String>();
    }

    public void addFlower(String f) {
        for (int i = 0; i < garden.size(); i++) {
            String name = garden.get(i).substring(garden.get(i).indexOf(" ") + 1);
            if (name.equals(f)) {
                int count = Integer.parseInt(garden.get(i).substring(0, garden.get(i).indexOf(" ")));
                String number = ("0" + (count + 1)).substring(0, 2);

                garden.remove(i);
                garden.add(number + " " + name);
                return;
            }
        }
        garden.add("01 " + f);
    }

    public int findFlower(String f) {
        for (int i = 0; i < garden.size(); i++) {
            String name = garden.get(i).substring(garden.get(i).indexOf(" ") + 1);
            if (name.equals(f)) {
                return i;
            }
        }
        return -1;
    }

    public int getCount(String f) {
        for (int i = 0; i < garden.size(); i++) {
            String name = garden.get(i).substring(garden.get(i).indexOf(" ") + 1);
            if (name.equals(f)) {
                return Integer.parseInt(garden.get(i).substring(0, garden.get(i).indexOf(" ")));
            }
        }
        return 0;
    }

    public String getFlowerName(int position) {
        if (inRange(position)) {
            return garden.get(position).substring(garden.get(position).indexOf(" ") + 1);
        }
        return "out of range";
    }

    public String maxFlower() {
        int num = 0;
        String flower = "";
        for (int i = 0; i < garden.size(); i++) {
            int amount = Integer.parseInt(garden.get(i).substring(0, garden.get(i).indexOf(" ")));
            if (amount > num) {
                num = amount;
                flower = garden.get(i);
            }
        }
        return flower;
    }

    public boolean inRange(int index) {
        return index >= 0 && index < garden.size();
    }

    public String toString() {
        return garden.toString();
    }
}
