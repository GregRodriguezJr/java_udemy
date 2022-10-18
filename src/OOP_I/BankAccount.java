package OOP_I;

public class BankAccount {
    // Create fields for the account number, balance, customer name, email and phone number.
    private String accountNum;
    private long balance;
    private String name;
    private String email;
    private String phoneNum;

    // Constructor to add user information
    public BankAccount(String accountNum, long balance, String name, String email, String phoneNum) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    // Create getters and setters for each field
    // Getters
    public String getAccountNum() {
        return this.accountNum;
    }
    public long getBalance() {
        return this.balance;
    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }
    // Setters
    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    // To allow the customer to deposit funds (this should increment the balance field).
    public void deposit(long depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " successful, your new account balance is: $" + this.balance);
    }
    // To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    public void withdraw(long withdrawAmount) {
        if(this.balance - withdrawAmount < 0) {
            System.out.println("Insufficient funds, current balance is: $" + this.balance + ", can not withdraw $" + withdrawAmount);
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Withdraw of $" + withdrawAmount + " successful, your new accout balance is: $" + this.balance);
        }
    }
}
