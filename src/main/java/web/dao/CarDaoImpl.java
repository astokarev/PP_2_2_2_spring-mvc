package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<>();
    public CarDaoImpl() {
        cars.add(new Car("Nissan", "Skyline", 1995));
        cars.add(new Car("Honda", "Civic", 2000));
        cars.add(new Car("Porshe", "911", 1995));
        cars.add(new Car("Tesla", "S", 2015));
        cars.add(new Car("Lada", "Kalina", 1995));
    }
    @Override
    public List<Car> getCars(int  count){
        List<Car> cars_edited = cars;
        if (count <= 5) {
            cars_edited = cars.stream().limit(count).collect(Collectors
                    .toCollection(ArrayList::new));
        }
        return cars_edited;
    }
}
