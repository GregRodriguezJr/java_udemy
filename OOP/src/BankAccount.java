
public class BankAccount {
    // Create fields for the account number, balance, customer name, email and phone number.
    private long accountNum;
    private long balance;
    private String name;
    private String email;
    private String phoneNum;

    // Create getters and setters for each field
    // Getters
    public long getAccountNum() {
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
    public void setAccountNum(long accountNum) {
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
        System.out.println("Your new account balance is: " + this.balance);
    }
    // To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    public void withdraw(long withdrawAmount) {
        this.balance -= withdrawAmount;
        System.out.println("Your new accout balance is: " + this.balance);
    }
}
