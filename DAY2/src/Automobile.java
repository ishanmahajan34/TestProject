/**
 * Created by mahajani on 7/25/2017.
 */

enum COLOR {
    RED, BLACK, BLUE, WHITE, SILVER
}
public class Automobile {

    int uid;
    String make;
    COLOR color;
    int speed;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public COLOR getColor() {
        return color;
    }

    public void setColor(COLOR color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Automobile(int uid, String make, COLOR color, int speed) {

        this.uid = uid;
        this.make = make;
        this.color = color;
        this.speed = speed;
    }
}
