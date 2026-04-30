package org.example.hexlet.dto.cars;

import java.util.List;
import org.example.hexlet.model.Car;

public class CarsPage {
    private List<Car> cars;

    public CarsPage(List<Car> cars) {
           this.cars = cars;
    }
    public List<Car> getCars() {
        return cars;
    }
}
