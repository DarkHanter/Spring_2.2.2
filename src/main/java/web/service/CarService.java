package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> CarsFromList(List<Car>cars, Integer counter);
}
