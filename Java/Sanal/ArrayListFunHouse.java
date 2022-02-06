import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListFunHouse {
    public static ArrayList<Integer> getListOfFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    public static void keepOnlyCompositeNumbers(List <Integer> nums) {
        for(int i = 0; i < nums.size(); i++) {
            if(getListOfFactors(nums.get(i)).isEmpty()) {
                nums.remove(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(2,3,6,8,9,10,12,13,15,17,19,23,24,55,59,66,78,77,79,83));
        keepOnlyCompositeNumbers(nums);
        System.out.println(nums);
    }
}