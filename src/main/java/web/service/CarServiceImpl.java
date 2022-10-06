package web.service;
import web.dao.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private CarDao cardao;

    @Autowired
    public CarServiceImpl(CarDao cardao) {
        this.cardao = cardao;
    }
    @Override
    public List<Car> getCars(int  count){
        return cardao.getCars(count);
    }

}
