package carplant;

public class FireTruck extends Truck {
    private static final Integer MINIMUM_WATER_CAPACITY = 1000;
    private static final Integer WATER_AMOUNT_TO_PUT_OUT_FIRE = 500;
    private Integer waterCapacity;

    public FireTruck() {
    }

    public FireTruck(Integer numberOfDoors, String color, double weight, Integer waterCapacity) {
        this.numberOfDoors = numberOfDoors;
        this.color = color;
        this.weight = weight;
        this.waterCapacity = waterCapacity;
    }

    public Integer getWaterCapacity() {
        return waterCapacity;
    }

    public void setWaterCapacity(Integer waterCapacity) {
        this.waterCapacity = waterCapacity;
    }

    @Override
    public boolean makeSignal() {  // Polymorphisim
        System.out.println("makeSignal");
        return true;
    }


    public void putOutFire() {
        if (waterCapacity >= MINIMUM_WATER_CAPACITY) {
            System.out.println("putting out fire!");
            waterCapacity -= WATER_AMOUNT_TO_PUT_OUT_FIRE;
        } else {
            throw new RuntimeException("Not enough Water!");
        }
    }


    @Override
    public boolean drive() {
        System.out.println("drive");
        return true;
    }

    @Override
    public String toString() {
        return "FireTruck{" +
                "waterCapacity=" + waterCapacity +
                ", numberOfDoors=" + numberOfDoors +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
