import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // method 1
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(5);
        list1.add(3);
        list1.add(7);
        ArrayList<Integer> list2 = twoTimes(list1);
        System.out.println(list1);
        System.out.println(list2);

        // method 2
        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("hi");
        list3.add("yo");
        list3.add("sup");
        list3.add("yolo");
        list3.add("boop");
        System.out.println(list3);
        removeEveryOther(list3);
        System.out.println(list3);

        // method 3
        ArrayList<Boolean> list4 = new ArrayList<Boolean>();
        list4.add(true);
        list4.add(false);
        list4.add(false);
        ArrayList<Boolean> list5 = repeatAll(list4);
        System.out.println(list4);
        System.out.println(list5);

        // method 4
        ArrayList<Integer> list6 = new ArrayList<Integer>();
        list6.add(1);
        list6.add(2);
        list6.add(3);
        list6.add(-4);
        list6.add(5);
        ArrayList<Integer> list7 = appendPosSum(list6);
        System.out.println(list6);
        System.out.println(list7);

        // method 5
        ArrayList<String> list8 = new ArrayList<String>();
        list8.add("one apple");
        list8.add("two orange");
        list8.add("four banana");
        System.out.println(list8);
        System.out.println(search(list8, "four"));

        // method 6
        ArrayList<Integer> list9 = new ArrayList<Integer>();
        list9.add(1);
        list9.add(1);
        list9.add(2);
        list9.add(3);
        list9.add(1);
        list9.add(4);
        ArrayList<Integer> list10 = removeInstances(list9, 1);
        System.out.println(list9);
        System.out.println(list10);;
    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> nums) {
        ArrayList<Integer> twoNums = new ArrayList<Integer>();
        for (int i = 0; i < nums.size() * 2; i++) {
            twoNums.add(nums.get(i/2));
        }
        return twoNums;
    }

    public static void removeEveryOther(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            words.remove(i);
        }
    }

    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> values) {
        ArrayList<Boolean> twoValues = new ArrayList<Boolean>();
        for (int i = 0; i < values.size() * 2; i++) {
            twoValues.add(values.get(i % values.size()));
        }
        return twoValues;
    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums) {
        int sum = 0;
        ArrayList<Integer> posNums = new ArrayList<Integer>();
        for (int num : nums) {
            if (num > 0) {
                posNums.add(num);
                sum += num;
            }
        }
        posNums.add(sum);
        return posNums;
    }

    public static String search(ArrayList<String> entries, String term) {
        for (String entry : entries) {
            if (entry.contains(term)) {
                return entry;
            }
        }
        return "search failed";
    }

    public static ArrayList<Integer> removeInstances(ArrayList<Integer> nums, int target) {
        ArrayList<Integer> remNums = new ArrayList<Integer>();
        for (int num : nums) {
            if (num != target) {
                remNums.add(num);
            }
        }
        return remNums;
    }
}
