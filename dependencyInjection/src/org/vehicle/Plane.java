package org.vehicle;

public class Plane implements Vehicle {
    public VehicleRepository vehicleRepository;

    public void setVehicleRepository(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
    @Override
    public void saveVehicleData() {
        vehicleRepository.saveVehicleData( "Plane", "Airbus");
    }
}
