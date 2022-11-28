public class CountPairs {
    
    public int pairCounter(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count++;
            }
        }
        return count;
    }
}
