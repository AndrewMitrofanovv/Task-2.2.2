package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    private final List<Car> carList = new ArrayList<>(Arrays.asList(
            new Car(1, "Audi", "Black"),
            new Car(2, "Mercedes", "Green"),
            new Car(3, "Volkswagen", "Blue"),
            new Car(4, "Ford", "Grey"),
            new Car(5, "BMW", "Yellow")));

    @Override
    public List<Car> getCar() {
        return carList;
    }
}
