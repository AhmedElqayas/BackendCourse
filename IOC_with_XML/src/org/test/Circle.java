package org.test;

public class Circle implements Shape {
    @Override
    public float getArea(int radius) {
        float bi = 3.14f;
        return bi * (float)Math.pow(radius, 2);
    }
}
