public class Main {
    public static void main(String args[]) {
        Circle c1 = new Circle(4);
        Rectangle r1 = new Rectangle(5, 7);

        // A Circle object can call getName() method from the Shape class
        System.out.println(c1.getName());

        // Calculates the Circle area from the Circle class and Rectangle area from the Rectangle class
        System.out.println("My Circle has an area of " + Math.round(c1.getArea()));
        System.out.println("My Rectangle has an area of " + Math.round(r1.getArea()));
        
        // Can print out info using the toString methods we created either by just printing the variable or calling toString()
        System.out.println(c1.toString());
        System.out.println(r1);
    }
}
