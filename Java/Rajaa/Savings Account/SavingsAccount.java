public class SavingsAccount {

    private static final double INTEREST_RATE = 0.035;

    private int accountNumber;
    private double balance;
    private String firstName;
    private String lastName;

    // precondition: fName and lName are not null.
    public SavingsAccount(int acctNum, double bal, String fName, String lName) {
        accountNumber = acctNum;
        balance = bal;
        firstName = fName;
        lastName = lName;
    }

    
    public double checkBalance() {
        return balance;
    }

    // postcondition: amount is added to balance
    public void deposit(double amount) {
        balance += amount;
    }

    // postcondition: amount is subtracted from balance
    // is amount is less than balance, the balance goes negative
    // and an error message is printed.
    public void withdraw(double amount) {
        balance -= amount;
        if (balance < 0) {
            System.out.println("Error. Negative Balance.");
        }
    }

    // postcondition: an amount equal to the interest rate multiplied
    // by the current balance is added to the balance.
    public void addInterest() {
        balance += INTEREST_RATE * balance;
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nAccount Number: " + accountNumber + "\nBalance: $" + balance;
    }
}