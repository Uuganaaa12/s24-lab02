package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Square;
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        Circle circle = new Circle(4);
        Square square = new Square(6.0);

        Renderer renderer1 = new Renderer(rectangle);
        Renderer renderer2 = new Renderer(circle);
        Renderer renderer3 = new Renderer(square);

        renderer1.draw(); 
        renderer2.draw();
        renderer3.draw(); 
    }
}
