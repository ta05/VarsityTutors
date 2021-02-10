import java.util.ArrayList;

public class ReadFileTester {
    public static void main(String [] args) throws Exception {
        ReadFile read = new ReadFile("./files/rand.txt");

        ArrayList<String> fileStream = read.getList();


        ArrayList<String> numArrayList = new ArrayList<String>();
        for (int i = 0; i < fileStream.size(); i++) {
            String arr[] = fileStream.get(i).split(",");
            for (String num : arr)
            numArrayList.add(num);
        }

        int[] numArray = new int[numArrayList.size()];
        for(int i = 0; i<numArrayList.size(); i++)
            numArray[i] = Integer.parseInt(numArrayList.get(i));

        Statistics s2 = new Statistics();

        System.out.print("Our list is: ");
        for (int num : numArray)
            System.out.print(num + " ");
        System.out.println();

        System.out.println("The mean of the list is: " + s2.getMean(numArray));
        System.out.println("The mode of the list is: " + s2.getMode(numArray));
	}
}
