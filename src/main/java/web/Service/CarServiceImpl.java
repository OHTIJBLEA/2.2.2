package web.Service;

import org.springframework.stereotype.Component;
import web.Dao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }


    @Override
    public List<Car> listCar(int count) {
        return carDao.listCar(count);
    }
}
