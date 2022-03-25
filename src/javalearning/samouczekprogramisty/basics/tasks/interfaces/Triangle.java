package javalearning.samouczekprogramisty.basics.tasks.interfaces;

public class Triangle implements Figure{
    public static final String TYPE = "triangle";
    private double base, height;

    public Triangle(double base, double height) {
        if(base <= 0 || height <= 0)
            throw new IllegalArgumentException();
        this.base = base;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 3 * base;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public String getFigureType() {
        return TYPE;
    }
}
