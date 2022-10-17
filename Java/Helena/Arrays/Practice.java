public class Practice {
    public static String[] copyRange(String[] num, int first, int last) {
        if (first < 0 || first >= num.length || last < 0 || last >= num.length || first > last) {
            return num;
        }
        int index = 0;
        String[] subNums = new String[last - first + 1];
        for (int i=first; i<=last; i++) {
            subNums[index] = num[i];
            index++;
        }
        return subNums;
    }

    public static String[] middleTwo(String a) {
        if (a.length() == 0) {
            return new String[0];
        }
        int strlen = a.length();
        if (strlen % 2 == 0) {
            return new String[] {a.substring(strlen/2-1, strlen/2), a.substring(strlen/2, strlen/2+1)};
        }
        return new String[] {a.substring(strlen/2-1, strlen/2)};
    }

    public static boolean allHaveAT(String[] arr) {
        for (String word : arr) {
            if (!word.contains("t")) {
                return false;
            }
        }
        return true;
    }

    public static boolean allBefore(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i].compareTo(b[i]) >= 0) {
                return false;
            }
        }
        return true;
    }

    public static int bookEnds(int[] a) {
        int count = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i-1] == 1 && a[i+1] == 1) {
                count++;
            }
        }
        return count;
    }
}