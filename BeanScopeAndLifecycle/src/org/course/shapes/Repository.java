package org.course.shapes;

public class Repository {
    public void init() {
        System.out.println("Database connection established.");
    }

    public void destroy() {
        System.out.println("Database connection closed.");
    }
}
