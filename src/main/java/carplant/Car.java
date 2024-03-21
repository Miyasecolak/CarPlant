package carplant;

public class Car {
    //Encapsulation
    protected Integer numberOfDoors;
    protected String color ;
    protected double weight;

    //Inheritance
    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean drive() {
        return true;
    }

    public boolean makeSignal() {
        return true;
    }

}
