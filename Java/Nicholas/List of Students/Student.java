public class Student extends Human{
    private int grade;
    private double gpa;

    public Student(String name, double height, int grade, double gpa) {
        super(name, height);
        this.grade = grade;
        this.gpa = gpa;
    }

    public int getGrade() {
        return grade;
    }

    public double getGPA() {
        return gpa;
    }

    public void updateGPA(double newGPA) {
        gpa = newGPA;
    }

    public String toString() {
        return super.toString() + "\nGrade: " + grade + "\nGPA: " + gpa;
    }
}
