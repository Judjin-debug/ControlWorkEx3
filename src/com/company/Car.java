package com.company;

public class Car {

    private String name;
    private CarModel carModel;
    private int engineCapacity;

    public Car () {

    };

    public Car (String name, CarModel carModel, int engineCapacity) {

        this.name = name;
        this.carModel = carModel;
        this.engineCapacity = engineCapacity;

    };

    public String getName () {
        return this.name;
    };

    public CarModel getCarModel () {
        return this.carModel;
    };

    public int getEngineCapacity () {
        return this.engineCapacity;
    };

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", carModel=" + carModel +
                ", engineCapacity=" + engineCapacity +
                '}';
    };

}
