public class StudentTest {
    public static void main(String[] args) {
        int[] g1 = { 70, 88, 98 };
        int[] g2 = { 40, 60, 65, 90 };
        Student a = new Student("Jack", g1);
        Student b = new Student("Jill", g2);
        System.out.println(a.getName()+" has an average: " +a.getAverage());
        System.out.println(b.getName()+" has an average: " +b.getAverage());
        if(a.compareTo(b)<0) System.out.println(b.getName()+":"+b+" has a better average.");
        else System.out.println(a.getName()+": "+a+" has a better average.");   
    }
}
