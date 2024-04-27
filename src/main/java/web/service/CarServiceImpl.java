package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{
    // Создайте список из 5 машин
    //4. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
    List<Car> cars =  new ArrayList<>(List.of(
            new Car("2.2.5", "mersedes", "black"),
            new Car("X5", "BMW", "green"),
            new Car("M2JI", "mazda", "white"),
            new Car("2002", "lada", "yellow"),
            new Car("432", "Wolswagen", "black")
    ));

    //. При запросе /cars выводить весь список. При запросе /cars?count=2 должен отобразиться список из 2 машин,
    //при /cars?count=3 - из 3, и тд. При count ≥ 5 выводить весь список машин.
    @Override
    public List<Car> getCars(int count) {
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
    //Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.

}
