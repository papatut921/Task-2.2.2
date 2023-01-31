package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;
    public CarServiceImpl(CarDao carDao){
        this.carDao = carDao;
    }
    @Override
    public List<Car> getAllCars(){
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getCountCars(int count) {
        if ((count >=5) || (count < 0)) {
            return carDao.getAllCars();
        } else {
            return carDao.getAllCars().subList(0, count);
        }
    }
}
