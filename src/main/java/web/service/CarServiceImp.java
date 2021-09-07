package web.service;


import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Audi", "A5", "white"));
        carList.add(new Car("BMW", "X5", "black"));
        carList.add(new Car("VW", "B6", "yellow"));
        carList.add(new Car("Mazda", "CX5", "red"));
        carList.add(new Car("Mercedes-Benz", "S126", "blue"));

    }

    @Override
    public List<Car> getCar(Integer count) {
        if (count == null || count >= 5) {
            return carList;
        }
        return carList.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
