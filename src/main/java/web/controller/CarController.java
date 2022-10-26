package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.Optional;

@Controller
public class CarController {

    private final CarService carService = new CarServiceImpl();


    @GetMapping("/cars")
    public String printCar(@RequestParam(value = "count") Optional<Integer> count, Model model) {

        model.addAttribute("listOfCars", carService.getCar(count.orElse(0)));

        return "cars";
    }
}
