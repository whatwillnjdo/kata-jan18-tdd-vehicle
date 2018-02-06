import java.util.Objects;

public class Vehicle {

    private String name;
    private String size;

    private int velocity;

    private int direction;

    public Vehicle(String name, String size, int velocity, int direction) {
        this.name = name;
        this.size = size;
        this.velocity = velocity;
        this.direction = direction;
    }

    public String getName() {
        return this.name;
    }

    public String getSize() {
        return size;
    }


    public int getVelocity() {
        return this.velocity;
    }

    public int getDirection() {
        return this.direction;
    }

    public void setVelocity(int newvelocity) {
        this.velocity = newvelocity;
    }

    public void setDirection(int newdirection) {
        this.direction = newdirection;
    }

    public void steer(int steerdirection) {
        direction = steerdirection;
    }

    public void move(int movevelocity, int moverdirection) {
        velocity = movevelocity;
        direction = moverdirection;
    }

    public void stop() {
        velocity = 0;
    }
}
