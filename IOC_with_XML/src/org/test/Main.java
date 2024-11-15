package org.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Shape circle = container.getBean("circle", Shape.class);
        Shape rectangle = container.getBean("rectangle", Shape.class);

        System.out.println("Area of circle = " + circle.getArea(3));
        System.out.println("Area of rectangle = " + rectangle.getArea(3));

    }
}
