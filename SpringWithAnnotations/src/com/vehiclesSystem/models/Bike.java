package com.vehiclesSystem.models;

import com.vehiclesSystem.controller.VehicleController;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Bike implements Vehicle {
    public int id;
    public String brand;
    public Type type;
}
