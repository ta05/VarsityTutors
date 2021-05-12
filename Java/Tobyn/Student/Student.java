public class Student implements Comparable<Student> {
    private String name;
    private int[] grades;

    public Student(String n, int[] g) {
        name = n;
        grades = new int[g.length];
        for (int i = 0; i < g.length; i++)
            grades[i] = g[i];
    }
    
    public String getName() {
        return name;
    }

    public double getAverage() {
        if (grades.length == 0)
            return 0;
        double sum = 0;
        for (int grade : grades)
            sum += grade;
        return sum / grades.length;
    }

    public String toString() {
        double average = getAverage();

        if (average >= 90)
            return "A";
        if (average >= 80)
            return "B";
        if (average >= 65)
            return "C";
        if (average >= 60)
            return "D";
        else
            return "F";
    }

    @Override
    public int compareTo(Student s) {
        if(this.getAverage() < s.getAverage())
            return -1;
        if(this.getAverage() > s.getAverage())
            return 1;
        return 0;
    }
}
