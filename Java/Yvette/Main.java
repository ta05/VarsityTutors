import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter\n1) 2D shape\n2) 3D shape: ");
        String dimension = sc.nextLine();

        String shape;

        switch (dimension) {
        case "1":
            System.out.print("Enter\n1) Circle\n2) Square\n3) Triangle: ");
            shape = sc.nextLine();
            switch (shape) {
            case "1":
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                System.out.println(new Circle(radius));
                break;
                
            case "2":
                System.out.print("Enter side length: ");
                double squareSide = sc.nextDouble();
                System.out.println(new Square(squareSide));
                break;

            case "3":
                System.out.print("Enter side length one: ");
                double triangleSide1 = sc.nextDouble();
                System.out.print("Enter side length two: ");
                double triangleSide2 = sc.nextDouble();
                System.out.print("Enter side length three: ");
                double triangleSide3 = sc.nextDouble();
                System.out.println(new Triangle(triangleSide1, triangleSide2, triangleSide3));
                break;

            default:
                break;
            }
            break;

        case "2":
            System.out.print("Enter\n1) Sphere\n2) Cube\n3) Tetrahedron: ");
            shape = sc.nextLine();
            switch (shape) {
            case "1":
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                System.out.println(new Sphere(radius));
                break;

            case "2":
                System.out.print("Enter side length: ");
                double cubeSide = sc.nextDouble();
                System.out.println(new Cube(cubeSide));
                break;

            case "3":
                System.out.print("Enter side length: ");
                double tetraSide = sc.nextDouble();
                System.out.println(new Sphere(tetraSide));
                break;

            default:
                break;
            }
            break;

        default:
            break;
        }
    }
}
