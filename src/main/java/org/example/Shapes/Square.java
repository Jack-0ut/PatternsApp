package org.example.Shapes;

import org.example.Shape;

public class Square extends Shape {
    public Square(){
        setType("Square");
    }
    @Override
    public void drawShape() {
        System.out.println("Draw Square");
    }
}
