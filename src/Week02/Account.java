package Week02;

public class Account {
    private String name;
    private int accountNumber;
    private double balance;

    // Constructor
    public Account(String name, int accountNumber, double balance) {
        setName(name);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }
    // Constructor Overloading
    public Account() {
        this("NA", 0, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double balance) { // Deposit method. Checks if the number is >0 and removes from the balance.
        if (balance > 0) {
            this.balance += balance;
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double balance) { // Withdraw method. Checks if the number is >0 and adds to the balance.
        if (balance > 0) {
            this.balance -= balance;
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    @Override
    public String toString() {
        return "Customer Name ='" + name + '\'' +
                ", Account Number ='" + accountNumber + '\'' + ", Account Balance ='" + balance + "'";
    }


}