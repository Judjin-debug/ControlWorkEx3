package com.company;

public class Main {

    public static void main(String[] args) {
        CarService carService = new CarService();
        carService.addToCars("Mercedes", CarModel.ONE, 1);
        carService.addToCars("BMW", CarModel.TWO, 2);
        carService.addToCars("Ford", CarModel.THREE, 2);
        carService.addToCars("Citroen", CarModel.ONE, 3);
        carService.displayCars();
        carService.engineCapacityMapOutput();
    };

}
