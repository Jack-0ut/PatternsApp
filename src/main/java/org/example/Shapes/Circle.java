package org.example.Shapes;

import org.example.Shape;

public class Circle extends Shape {
    public Circle(){
        setType("Circle");
    }
    @Override
    public void drawShape() {
        System.out.println("Draw Circle");
    }
}
