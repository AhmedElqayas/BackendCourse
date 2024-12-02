package com.vehiclesSystem.controller;

import com.vehiclesSystem.dao.DatabaseOperations;
import com.vehiclesSystem.models.Bike;
import com.vehiclesSystem.models.BikeDTO;
import com.vehiclesSystem.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BikeController implements VehicleController {
    @Autowired
    public BikeDTO bikeDTO;
    public void saveVehicle(Vehicle vehicle) {
        bikeDTO.saveBike((Bike) vehicle);
    }
}
