package vehicles;

public class Truck extends Car {
    private int loadCapacity;

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                "} " + super.toString();
    }
}
