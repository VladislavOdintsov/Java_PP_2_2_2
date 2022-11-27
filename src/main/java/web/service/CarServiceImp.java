package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{
    List<Car> cars;


    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", 325));
        cars.add(new Car(2, "AUDI", 8));
        cars.add(new Car(3, "Porshe", 911));
        cars.add(new Car(4, "Volvo", 90));
        cars.add(new Car(5, "Mercedes", 222));
    }

    @Override
    public List<Car> listCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
