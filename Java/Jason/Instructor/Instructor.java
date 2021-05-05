public class Instructor extends Employee{
    protected int idNumber;
    protected boolean mailList;

    public Instructor() {
        super();
        idNumber = 0;
        mailList = false;
    }

    public Instructor(String name, String department, String address, String telephoneNumber, int idNumber,
            boolean mailList) {
        super(name, department, address, telephoneNumber);
        this.idNumber = idNumber;
        this.mailList = mailList;
    }
    
    public int getInstructorId() {
        return idNumber;
    }

    public boolean isOnMailingList() {
        return mailList;
    }

    public void setInstructorId(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setMailingList(boolean mailList) {
        this.mailList = mailList;
    }
}
