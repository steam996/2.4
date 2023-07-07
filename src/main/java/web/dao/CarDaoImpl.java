package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    List<Car> cars = new ArrayList<>();{
        cars.add(new Car("Ford", 300, 1998));
        cars.add(new Car("Porch", 911, 2023));
        cars.add(new Car("Volvo", 70, 2005));
        cars.add(new Car("Lada", 21014, 1507));
        cars.add(new Car("AUDI", 100, 1991));
    }
    @Override
    public List<Car> cars(int count) {
       return cars.stream().collect(Collectors.toList());
    }
}
