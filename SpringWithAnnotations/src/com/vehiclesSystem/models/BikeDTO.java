package com.vehiclesSystem.models;

import com.vehiclesSystem.dao.DatabaseOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BikeDTO {
    @Autowired
    public DatabaseOperations databaseOperations;

    public void saveBike(Bike bike) {
        databaseOperations.save(bike.id, bike.brand, bike.type);
    }
}
