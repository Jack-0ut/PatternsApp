package org.example;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape ->" + shape1.getType() +" Hash -> " + shape1.hashCode());

        Shape shape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape ->" + shape2.getType() + " Hash -> " + shape2.hashCode());

        Shape shape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape ->" + shape3.getType() + " Hash -> " + shape3.hashCode());

        Shape shape4 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape ->" + shape4.getType() + " Hash -> " + shape4.hashCode());

        Shape shape5 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape ->" + shape5.getType() + " Hash -> " + shape5.hashCode());

        Shape shape6 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape ->" + shape6.getType() + " Hash -> " + shape6.hashCode());


    }
}
