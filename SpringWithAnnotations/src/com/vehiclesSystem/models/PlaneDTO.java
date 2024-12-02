package com.vehiclesSystem.models;

import com.vehiclesSystem.dao.DatabaseOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlaneDTO {
    @Autowired
    public DatabaseOperations databaseOperations;

    public void savePlane(Plane plane) {
        databaseOperations.save(plane.id, plane.brand, plane.type);
    }
}
