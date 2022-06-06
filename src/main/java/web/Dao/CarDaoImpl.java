package web.Dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao{
    List<Car> listCar;

    {
        listCar = new ArrayList<>();
        listCar.add(new Car("BMW", "x5", 5));
        listCar.add(new Car("LADA", "vesta", 2));
        listCar.add(new Car("Mercedes", "c200", 7));
        listCar.add(new Car("Nissan", "Qashqai", 3));
        listCar.add(new Car("Audi", "a7", 1));
    }

    @Override
    public List<Car> listCar(int count) {
        if(count > 5) return listCar;
        return listCar.stream().limit(count).collect(Collectors.toList());
    }
}
