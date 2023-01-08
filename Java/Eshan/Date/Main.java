public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(1,1,2001);
        d1.addDays(120);
        System.out.println(d1);
        
        d1.addDays(365);
        System.out.println(d1);
        
        d1.addDays(1500);
        System.out.println(d1);

        Date d2 = new Date(20,4,2004);
        Date d3 = new Date(1,1,2001);
        System.out.println(d3.daysTo(d2));
        
    }
}
