package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {

    public List<Car> carList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Honda", "S1", 25));
        cars.add(new Car("Toyota", "S2", 13));
        cars.add(new Car("Subaru", "S3", 11));
        cars.add(new Car("Audi", "S4", 56));
        cars.add(new Car("Dodge", "S5", 34));
        return cars;
    }

    @Override
    public List<Car> carsFromList(Integer counter) {
        if(counter != null) {
            return carList().stream().limit(counter).collect(Collectors.toList());
        }
        return carList();
    }
}
