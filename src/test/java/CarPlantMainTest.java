import carplant.Car;
import carplant.FireTruck;
import carplant.Truck;

public class CarPlantMainTest {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            FireTruck fireTruck = new FireTruck(2, "red", 10234, 1000);
            System.out.println("fireTruck"+(i+1)+" = " + fireTruck);
        }

        Car fireTruck4 = new FireTruck(3, "green", 65433, 100);
        // because it is initiated as Car
        // can't call fireTruck4.putOutFire()
        // can't call fireTruck4.getWaterCapacity()
        System.out.println("fireTruck4 = " + fireTruck4);

        Truck fireTruck5 = new FireTruck(4, "blue", 34567, 200);
        // because it is initiated as Truck
        // can't call fireTruck5.putOutFire()
        // can't call fireTruck5.getWaterCapacity()
        System.out.println("fireTruck5 = " + fireTruck5);
    }

}

