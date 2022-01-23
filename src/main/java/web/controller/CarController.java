package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.service.CarService;

@Controller
public class CarController {
    @Autowired
    private CarDao carDao;
    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("message", carService.CarsFromList(carDao.listCars(), count));return "cars";
    }
}
