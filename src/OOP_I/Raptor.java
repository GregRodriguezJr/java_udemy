package OOP_I;

public class Raptor extends Car {
    private int roadServiceMonths;

    public int getRoadServiceMonths() {
        return roadServiceMonths;
    }

    public Raptor(int roadServiceMonths) {
        super("OOP_I.Raptor", "white", 4, 5, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    
    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity <= 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else if (newVelocity > 30 && newVelocity <= 40) {
            changeGear(4);
        } else {
            changeGear(5);
        }
        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
