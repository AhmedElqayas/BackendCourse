package org.course.shapes;

public class Circle implements Shape {
    public Draw2D draw2D;
    public Circle(Draw2D draw2D) {
        this.draw2D = draw2D;
    }
    @Override
    public void draw() {
        draw2D.draw2D("Circle " + this);
    }
}
