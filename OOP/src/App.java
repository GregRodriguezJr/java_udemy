public class App {
    public static void main(String[] args) throws Exception {
        // Test BankAccount output
        BankAccount account123 = new BankAccount();
        account123.setName("John Doe");
        account123.setBalance(3500);
        System.out.println(account123.getBalance());
        account123.withdraw(600);
    }
}
