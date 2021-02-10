public class StatisticsDriver {
    public static void main(String args[]) {
        Statistics test1 = new Statistics();
        int[] numList = test1.createList(100);
        for(int num : numList)
            System.out.print(num + " ");
        System.out.println();
        System.out.println("The Mean of our list is " + test1.getMean(numList));
        System.out.println("The Mode of our list is " + test1.getMode(numList));
    }
}
