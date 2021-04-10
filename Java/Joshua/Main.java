public class Main {
    public static void main(String[] ars) {
        Stat s1 = new Stat();
        double[] data1 = { 2.8, -4.4, 6.9, 4.2, -3.3, 5.8, 9.1, -8.8, 7.6, -1.9 };

        s1.setData(data1);

        System.out.println("Data: " + s1);
        System.out.println("Min: " + s1.min());
        System.out.println("Max: " + s1.max());
        System.out.println("Mean: " + s1.average());
        System.out.println("Mode: " + s1.mode());

        double[] data2 = { -2.0, 4.0, -6.0, 8.0, -10.0 };

        Stat s2 = new Stat(data2);

        System.out.println();

        System.out.println("Data: " + s2);
        System.out.println("Min: " + s2.min());
        System.out.println("Max: " + s2.max());
        System.out.println("Mean: " + s2.average());
        System.out.println("Mode: " + s2.mode());

        System.out.println();

        System.out.println("s1 and s2 are the same: " + s1.equals(s2));

        Stat s3 = new Stat(data1);

        System.out.println();

        System.out.println("Data: " + s3);
        System.out.println("s1 and s3 are the same: " + s1.equals(s3));

        double[] data3 = { -1.9, 2.8, -4.4, 6.9, 4.2, -3.3, 5.8, 9.1, -8.8, 7.6 };

        Stat s4 = new Stat();
        s4.setData(data3);

        System.out.println();

        System.out.println("Data: " + s4);
        System.out.println("s1 and s4 are the same: " + s1.equals(s4));
    }
}
