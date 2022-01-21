package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public static List<Car> CarsFromList(List<Car>cars, Integer counter) {
        if(counter != null) {
            return cars.stream().limit(counter).collect(Collectors.toList());
        }
        return cars;
    }
}
