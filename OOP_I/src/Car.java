public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManuel;
    private int currentGear;

    public Car(String name, String color, int wheels, int doors, int gears, boolean isManuel) {
        super(name, color);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManuel = isManuel;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): changed to " + this.currentGear + " gear.");
    }
    
    public void changeVelocity(int speed, int direction) {
        System.out.println("ChangeVelocity(): speed is " + speed + " direction is " + direction + " degrees.");
        move(speed, direction);
    }
}
