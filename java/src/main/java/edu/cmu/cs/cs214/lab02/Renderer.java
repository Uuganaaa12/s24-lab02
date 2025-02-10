package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    private Shape shape;

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    void draw() {
        double area = shape.getArea();
        double perimeter = shape.getPerimeter();
        System.out.printf("\nShape printed: %s\nIts area is %.2f\nIts perimeter is %.2f\n\n",
                shape.getClass().getSimpleName(), area, perimeter);
    }
    
}
