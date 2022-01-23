package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> listCars();
    List<Car> CarsFromList(List<Car>cars, Integer counter);
}
