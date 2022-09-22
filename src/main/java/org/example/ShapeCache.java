package org.example;

import org.example.Shapes.Circle;
import org.example.Shapes.Rectangle;
import org.example.Shapes.Square;

import java.util.HashMap;
import java.util.Hashtable;

public class ShapeCache {
    private static HashMap<String,Shape> shapeMap = new HashMap<String,Shape>();

    public static Shape getShape(String shapeID){
        Shape shapeCache = shapeMap.get(shapeID);
        return (Shape)  shapeCache.clone();
    }
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }

}
