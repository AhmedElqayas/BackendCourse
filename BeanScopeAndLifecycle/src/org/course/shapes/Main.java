package org.course.shapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Shape circle1 = context.getBean("circle", Shape.class);
        Shape circle2 = context.getBean("circle", Shape.class);
        Shape square1 = context.getBean("square", Shape.class);
        Shape square2 = context.getBean("square", Shape.class);

        circle1.draw();
        circle2.draw();
        square1.draw();
        square2.draw();

        Repository repository = context.getBean("repository", Repository.class);
        context.close();
        }
    }