package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{

    private final CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> getCar(int count) {
        if (count == 0) {
            return carDao.getCar();
        }
        return carDao.getCar().stream().limit(count).collect(Collectors.toList());
    }
}
