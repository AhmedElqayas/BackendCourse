package org.shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("ApplicationContext.xml");

//        Shape circle = container.getBean("circle", Shape.class);
//        circle.draw();
//
//        Shape square = container.getBean("square", Shape.class);
//        square.draw();

        Vehicle car = container.getBean("car", Vehicle.class);
        car.saveVehicleData();

        Vehicle plane = container.getBean("plane", Vehicle.class);
        plane.saveVehicleData();

    }
}