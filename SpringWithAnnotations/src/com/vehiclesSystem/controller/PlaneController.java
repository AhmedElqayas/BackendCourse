package com.vehiclesSystem.controller;

import com.vehiclesSystem.dao.DatabaseOperations;
import com.vehiclesSystem.models.Plane;
import com.vehiclesSystem.models.PlaneDTO;
import com.vehiclesSystem.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlaneController implements VehicleController {
    public PlaneDTO planeDTO;
    @Autowired
    public void setPlaneDTO(PlaneDTO planeDTO) {
        this.planeDTO = planeDTO;
    }

    public void saveVehicle(Vehicle vehicle) {
        planeDTO.savePlane((Plane) vehicle);
    }
}
