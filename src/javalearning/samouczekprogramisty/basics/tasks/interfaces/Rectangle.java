package javalearning.samouczekprogramisty.basics.tasks.interfaces;

public class Rectangle implements Figure{
    public static final String TYPE = "rectangle";
    private double length, width;

    public Rectangle(double length, double width) {
        if(length <= 0 || width <= 0)
            throw new IllegalArgumentException();
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getFigureType() {
        return TYPE;
    }
}
