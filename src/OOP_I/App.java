package OOP_I;

public class App {
    public static void main(String[] args) throws Exception {
        // Test OOP_I.BankAccount output
        // OOP_I.BankAccount newMember = new OOP_I.BankAccount("1234", 0, "John Doe", "johndoe@gmail.com", "555-555-5555");

        // newMember.withdraw(50);
        // newMember.deposit(100);
        // newMember.withdraw(10);
        // System.out.println(newMember.getAccountNum());

        // Test OOP_I.VipCustomer
        // OOP_I.VipCustomer vipMember1 = new OOP_I.VipCustomer();
        // System.out.println(vipMember1.getName());

        // OOP_I.VipCustomer vipCustomer2 = new OOP_I.VipCustomer("John", 2500);
        // System.out.println(vipCustomer2.getCreditLimit());
        // System.out.println(vipCustomer2.getEmail());

        // OOP_I.VipCustomer vipCustomer3 = new OOP_I.VipCustomer("Bill", 5500, "bill@gmail.com");
        // System.out.println(vipCustomer3.getName());
        // System.out.println(vipCustomer3.getCreditLimit());
        // System.out.println(vipCustomer3.getEmail());

        // Test OOP_I.Wall
        //  OOP_I.Wall wall = new OOP_I.Wall(5,4);
        //  System.out.println("area= " + wall.getArea());
         
        //  wall.setHeight(-1.5);
        //  System.out.println("width= " + wall.getWidth());
        //  System.out.println("height= " + wall.getHeight());
        //  System.out.println("area= " + wall.getArea());

        // Test OOP_I.Vehicle
        Raptor fordRaptor = new Raptor(24);
        fordRaptor.steer(90);
        fordRaptor.accelerate(40);
        fordRaptor.accelerate(10);
        fordRaptor.accelerate(-20);
    }
}

