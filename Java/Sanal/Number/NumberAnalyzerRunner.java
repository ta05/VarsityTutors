public class NumberAnalyzerRunner {
    public static void main(String[] args) {
        int[] nums = {5,12,9,6,1,4,8,6};
        NumberAnalyzer test = new NumberAnalyzer(nums);
        System.out.println(test);
        System.out.println("Odd count = " + test.countOdds());
        System.out.println("Even count = " + test.countEvens());
        System.out.println("Perfect count = " + test.countPerfects());

        int[] nums2 = {5,12,3,7,28,496,81,65,33,11};
        test = new NumberAnalyzer(nums2);
        System.out.println(test);
        System.out.println("Odd count = " + test.countOdds());
        System.out.println("Even count = " + test.countEvens());
        System.out.println("Perfect count = " + test.countPerfects());

        int[] nums3 = {1,2,3,4,5,6,7,8,11,13,151,16,17,18,19,20};
        test = new NumberAnalyzer(nums3);
        System.out.println(test);
        System.out.println("Odd count = " + test.countOdds());
        System.out.println("Even count = " + test.countEvens());
        System.out.println("Perfect count = " + test.countPerfects());
    }
}
