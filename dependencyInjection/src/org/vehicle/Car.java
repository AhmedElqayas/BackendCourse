package org.vehicle;

import java.sql.SQLException;

public class Car implements Vehicle {
    public VehicleRepository vehicleRepository;

    public Car(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
    @Override
    public void saveVehicleData() {
        vehicleRepository.saveVehicleData( "Car", "BMW");
    }
}
