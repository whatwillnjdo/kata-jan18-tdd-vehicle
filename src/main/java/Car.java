import java.util.List;

public final class Car extends Vehicle{
    String name;
    String size;
    int wheels;
    int doors;
    int gears;
    boolean isManual;
    int currentGear =0;

    public Car(String name, String size, int velocity, int direction) {
        super(name, size, velocity, direction);
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public void changeVelocity(int speed, int direction) {
        int vehiclevelocity = getVelocity();
        setVelocity(vehiclevelocity + speed);

    }
}
