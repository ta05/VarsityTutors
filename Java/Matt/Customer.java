
public class Customer implements Comparable<Customer> {
    private String name;
    private int age;
    private boolean isMedicalWorker;

    public Customer() {
        age = 0;
        name = "";
        isMedicalWorker = false;
    }

    public Customer(String name, int age, boolean isMedicalWorker) {
        this.name = name;
        this.age = age;
        this.isMedicalWorker = isMedicalWorker;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        if (isMedicalWorker)
            return 1;
        else if (age >= 75)
            return 2;
        else if (age >= 65 && age < 75)
            return 3;
        return 4;
    }
    
    @Override
    public int compareTo(Customer c) {
        if (getGroup() < c.getGroup())
            return -1;
        else if (getGroup() > c.getGroup())
            return 1;
        else
            return 0;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nMedical Worker? " + isMedicalWorker;
    }
}
