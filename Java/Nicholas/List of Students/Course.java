import java.util.ArrayList;

public class Course {
    private ArrayList<Student> studentList;

    public Course() {
        studentList = new ArrayList<Student>();
    }

    public Course(ArrayList<Student> studentList) {
        this.studentList = new ArrayList<Student>();
        for (Student s : studentList) {
            this.studentList.add(s);
        }
    }

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public Student findHighestGPA() {
        if (studentList.isEmpty()) {
            return null;
        }
        Student bestGPAStudent = studentList.get(0);
        double gpa = 0;
        for (Student s : studentList) {
            if (s.getGPA() > gpa) {
                bestGPAStudent = s;
                gpa = s.getGPA();
            } 
        }
        return bestGPAStudent;
    }

    public Student drop(String name) {
        for(int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equals(name)) {
                return studentList.remove(i);
            }
        }
        System.out.printf("There is no %s in the course", name);
        return null;
    }

    public String toString() {
        String allstudents = "";
        for (Student s : studentList) {
            allstudents += s.toString() + "\n\n";
        }
        return allstudents.trim();
    }
}
