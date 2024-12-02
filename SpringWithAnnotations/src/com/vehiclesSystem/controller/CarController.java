package com.vehiclesSystem.controller;

import com.vehiclesSystem.dao.DatabaseOperations;
import com.vehiclesSystem.models.Car;
import com.vehiclesSystem.models.CarDTO;
import com.vehiclesSystem.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarController implements  VehicleController {
    public CarDTO carDTO;
    @Autowired
    public CarController(CarDTO carDTO) {
        this.carDTO = carDTO;
    }

    public void saveVehicle(Vehicle vehicle) {
        carDTO.saveCar((Car) vehicle);
    }
}
