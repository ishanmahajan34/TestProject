/**
 * Created by mahajani on 7/27/2017.
 */
public class Main {
    public static void main(String[] args) {

        Bike bike = new Bike(321,"CBR250",200,2);
        Car car = new Car(982,"HONDA CITY",100,4);

        bike.details();
        bike.drive();
        bike.inspect();
        System.out.println("---------------------------");
        car.details();
        car.drive();
        car.inspect();

    }
}