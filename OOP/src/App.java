public class App {
    public static void main(String[] args) throws Exception {
        // Test BankAccount output
        // BankAccount newMember = new BankAccount("1234", 0, "John Doe", "johndoe@gmail.com", "555-555-5555");

        // newMember.withdraw(50);
        // newMember.deposit(100);
        // newMember.withdraw(10);
        // System.out.println(newMember.getAccountNum());

        // Test VipCustomer
        // VipCustomer vipMember1 = new VipCustomer();
        // System.out.println(vipMember1.getName());

        // VipCustomer vipCustomer2 = new VipCustomer("John", 2500);
        // System.out.println(vipCustomer2.getCreditLimit());
        // System.out.println(vipCustomer2.getEmail());

        // VipCustomer vipCustomer3 = new VipCustomer("Bill", 5500, "bill@gmail.com");
        // System.out.println(vipCustomer3.getName());
        // System.out.println(vipCustomer3.getCreditLimit());
        // System.out.println(vipCustomer3.getEmail());

        // Test Wall
         Wall wall = new Wall(5,4);
         System.out.println("area= " + wall.getArea());
         
         wall.setHeight(-1.5);
         System.out.println("width= " + wall.getWidth());
         System.out.println("height= " + wall.getHeight());
         System.out.println("area= " + wall.getArea());
    }
}

