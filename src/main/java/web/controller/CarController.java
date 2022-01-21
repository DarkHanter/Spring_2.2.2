package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Honda", "S1", 25));
        cars.add(new Car("Toyota", "S2", 13));
        cars.add(new Car("Subaru", "S3", 11));
        cars.add(new Car("Audi", "S4", 56));
        cars.add(new Car("Dodge", "S5", 34));
        model.addAttribute("message", CarService.CarsFromList(cars, count));
        return "cars";
    }
}
