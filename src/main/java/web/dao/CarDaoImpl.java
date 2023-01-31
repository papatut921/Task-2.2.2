package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Mers", "Black", 8000));
        cars.add(new Car("Volvo", "Green", 7500));
        cars.add(new Car("BMW", "Blue", 11000));
        cars.add(new Car("VAZ", "White", 1000));
        cars.add(new Car("Audi", "Red", 8500));
    }
    @Override
    public List<Car> getAllCars(){
        return cars;
    }
}
