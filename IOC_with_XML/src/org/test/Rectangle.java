package org.test;

public class Rectangle implements Shape {
    @Override
    public float getArea(int length) {
        return length * length;
    }
}
