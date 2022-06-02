package vehicles;

import details.Engine;
import professions.Driver;

public class Car implements Vehicle {
    private String carType;
    private int weight;
    private Driver driver;
    private Engine engine;


    public int getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void start() {
        System.out.println("�������");
    }
    public void stop() {
        System.out.println("���������������");
    }
    public void turnRight() {
        System.out.println("������������ �������");
    }
    public void turnLeft() {
        System.out.println("������������ ������");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}

