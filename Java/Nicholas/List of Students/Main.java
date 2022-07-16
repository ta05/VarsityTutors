public class Main {
    public static void main(String[] args) {
        Course c = new Course();

        c.addStudent(new Student("Anne", 154, 10, 4.0));
        c.addStudent(new Student("Bobby", 175, 9, 3.3));
        c.addStudent(new Student("Cath", 172, 12, 3.4));
        c.addStudent(new Student("Derek", 170, 11, 3.8));
        c.addStudent(new Student("Erin", 163, 11, 2.8));

        System.out.println(c);

        System.out.println(c.findHighestGPA());

        Student bob = c.drop("Bobby");

        System.out.println(c);
        System.out.println(bob);

        c.drop("Franklin");
    }
}
