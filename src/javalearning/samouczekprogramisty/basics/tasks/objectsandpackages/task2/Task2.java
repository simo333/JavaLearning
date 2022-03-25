package javalearning.samouczekprogramisty.basics.tasks.objectsandpackages.task2;

public class Task2 {
    private double length;
    private double width;

    public Task2(double length, double width) {
        if(length <= 0 || width <= 0)
            throw new IllegalArgumentException("Negative or zero values are forbidden.");
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <= 0 || width <= 0)
            throw new IllegalArgumentException("Negative or zero values are forbidden.");
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(length <= 0 || width <= 0)
            throw new IllegalArgumentException("Negative or zero values are forbidden.");
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }
}
