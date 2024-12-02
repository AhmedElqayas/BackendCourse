package com.vehiclesSystem;


import com.vehiclesSystem.config.Config;
import com.vehiclesSystem.controller.BikeController;
import com.vehiclesSystem.controller.CarController;
import com.vehiclesSystem.controller.PlaneController;
import com.vehiclesSystem.dao.DatabaseOperations;
import com.vehiclesSystem.models.Bike;
import com.vehiclesSystem.models.Car;
import com.vehiclesSystem.models.Plane;
import com.vehiclesSystem.models.Type;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Bike bike = context.getBean(Bike.class, 1, "Trix", Type.BIKE);
        Car car = context.getBean(Car.class, 2, "BMW", Type.CAR);
        Plane plane = context.getBean(Plane.class, 3, "Airbus", Type.PLANE);

        BikeController bikeController = context.getBean("bikeController", BikeController.class);
        CarController carController = context.getBean("carController", CarController.class);
        PlaneController planController = context.getBean("planeController", PlaneController.class);

        bikeController.saveVehicle(bike);
        carController.saveVehicle(car);
        planController.saveVehicle(plane);

        context.close();
    }
}
