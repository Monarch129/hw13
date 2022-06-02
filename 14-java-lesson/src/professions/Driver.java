package professions;

public class Driver extends Person {
    private int drivingExperience;


    public int getDrivingExperience() {
        return drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivingExperience=" + drivingExperience +
                "} " + super.toString();
    }
}
