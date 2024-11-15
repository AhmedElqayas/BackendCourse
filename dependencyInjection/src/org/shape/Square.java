package org.shape;

public class Square implements Shape {
    public Draw3D draw3D;

    public void setDraw3D(Draw3D draw3D) {
        this.draw3D = draw3D;
    }
    @Override
    public void draw() {
        draw3D.drawShape("square");
    }
}
