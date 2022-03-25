package javalearning.samouczekprogramisty.basics.tasks.interfaces;

public class Circle implements Figure{
    public static final String TYPE = "circle";
    private double radius;

    public Circle(double radius) {
        if(radius <= 0)
            throw new IllegalArgumentException();
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String getFigureType() {
        return TYPE;
    }
}
