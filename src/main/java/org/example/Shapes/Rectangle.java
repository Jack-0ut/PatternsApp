package org.example.Shapes;

import org.example.Shape;

public class Rectangle extends Shape {
    public Rectangle(){
        setType("Rectangle");
    }
    @Override
    public void drawShape() {
        System.out.println("Draw Rectangle");
    }
}
