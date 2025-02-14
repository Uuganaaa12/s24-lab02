package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }    
    public double getPerimeter() {
        return side * 4;
    }

}