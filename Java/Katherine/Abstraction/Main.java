public class Main {
    public static void main(String args[]) {
        Circle c1 = new Circle(4);
        c1.getName();

        System.out.println("My Circle has an area of " + Math.round(c1.getArea()));

        Rectangle r1 = new Rectangle(5, 7);

        System.out.println("My Rectangle has an area of " + Math.round(r1.getArea()));

        
    }
}
