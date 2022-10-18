package OOP_I;

public class VipCustomer {
        // Create a new class OOP_I.VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        private String name;
        private long creditLimit;
        private String email;

        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        public VipCustomer() {
            this("default name", 5000, "default@email.com");
        }
        
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        public VipCustomer(String name, long creditLimit) {
            this(name, creditLimit, "unknown@email.com");
        }

        // 3rd constructor should save all fields.
        public VipCustomer(String name, long creditLimit, String email) {
            this.name = name;
            this.creditLimit = creditLimit;
            this.email = email;
        }

        // create getters only for this using code generation of intellij as setters wont be needed
        public String getName() {
            return this.name;
        }

        public long getCreditLimit() {
            return this.creditLimit;
        }

        public String getEmail() {
            return this.email;
        }                
}
