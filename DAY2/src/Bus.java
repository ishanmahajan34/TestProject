/**
 * Created by mahajani on 7/25/2017.
 */
public class Bus extends Automobile {

    String model;
    String fuelType;
    String type;

    public Bus(int uid, String make, COLOR color, int speed, String model, String fuelType, String type) {
        super(uid, make, color, speed);
        this.model = model;
        this.fuelType = fuelType;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelCapacity() {
        return fuelType;
    }

    public void setFuelCapacity(String fuelCapacity) {
        this.fuelType = fuelCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    void accelerate() {
        System.out.println("BUS IS ACCELERATING !");
        super.speed = super.speed + 8;
        System.out.println("BUS SPEED IS " + speed);
    }
    void decelerate() {
        System.out.println("BUS IS DECELERATING !");
        super.speed = super.speed - 4;
        System.out.println("BUS SPEED IS " + speed);
    }

}
