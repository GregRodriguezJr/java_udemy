public class App {
    public static void main(String[] args) throws Exception {
        // Test BankAccount output
        BankAccount newMember = new BankAccount("1234", 0, "John Doe", "johndoe@gmail.com", "555-555-5555");

        newMember.withdraw(50);
        newMember.deposit(100);
        newMember.withdraw(10);
        System.out.println(newMember.getAccountNum());
    }
}
