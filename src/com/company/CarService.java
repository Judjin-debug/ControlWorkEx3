package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;


public class CarService {

    private List<Car> cars = new ArrayList<Car>();

    public void displayCars () {
        for (int i = 0; i < this.cars.size(); i++) {
            System.out.println("Car " + String.valueOf(i + 1) + ":");
            System.out.println(this.cars.get(i).toString());
        };
    };

    public void addToCars (String name, CarModel carModel, int engineCapacity) {
        Car car = new Car(name, carModel, engineCapacity);
        this.cars.add(car);
    };

    private HashMap<Integer, ArrayList<Car>> mapInit () {
        HashMap<Integer, ArrayList<Car>> carsMap = new HashMap <Integer, ArrayList<Car>>();
        for (int i = 0; i < 3; i++) {
            carsMap.put(i + 1, carsFilterByEngineCapacity(i+1));
        };
        return carsMap;
    };

    private ArrayList<Car> carsFilterByEngineCapacity (int number) {
        ArrayList<Car> filteredCars = new ArrayList<Car>(this.cars);
        int length = filteredCars.size();
        for (int i = length - 1; i > -1; i--) {
            if (filteredCars.get((i)).getEngineCapacity() != number) {
                filteredCars.remove(i);
            };
        };
        return filteredCars;
    };

    public void engineCapacityMapOutput () {
        HashMap<Integer, ArrayList<Car>> carsMap = mapInit();
        carsMap.forEach((key, value) -> System.out.println("Key:\n" + key + "\nValue:\n" + value));
    };

};
