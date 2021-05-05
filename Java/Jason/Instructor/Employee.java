public class Employee {
    protected String name;
    protected String department;
    protected String address;
    protected String telephoneNumber;

    public Employee() {
        name = "";
        department = "";
        address = "";
        telephoneNumber = "";
    }

    public Employee(String name, String department, String address, String telephoneNumber) {
        this.name = name;
        this.department = department;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return telephoneNumber;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}