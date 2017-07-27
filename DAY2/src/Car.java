import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * Created by mahajani on 7/25/2017.
 */
public class Car extends Automobile {

    String model;
    String fuelType;
    String type;

    public Car(int uid, String make, COLOR color, int speed, String model, String fuelType, String type) {
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
        System.out.println("CAR IS ACCELERATING !");
        super.speed = super.speed + 10;
        System.out.println("CAR SPEED IS " + speed);
    }
    void decelerate() {
        System.out.println("CAR IS DECELERATING !");
        super.speed = super.speed - 5;
        System.out.println("CAR SPEED IS " + speed);
    }

}
