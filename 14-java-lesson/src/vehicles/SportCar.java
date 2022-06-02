package vehicles;

public class SportCar extends Car {
    private int minimalDrivingExperience;

    @Override
    public void start() {
        if (minimalDrivingExperience > super.getDriver().getDrivingExperience()) {
            System.out.println("¬одитель недостаточно квалифицирован, требуемый стаж: " + minimalDrivingExperience +
                    "стаж водител€: " + super.getDriver().getDrivingExperience());
        }
        else {
            super.start();
        }
    }
}
