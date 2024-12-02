package com.vehiclesSystem.models;

import com.vehiclesSystem.dao.DatabaseOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarDTO {
    @Autowired
    public DatabaseOperations databaseOperations;

    public void saveCar(Car car) {
        databaseOperations.save(car.id, car.brand, car.type);
    }
}
