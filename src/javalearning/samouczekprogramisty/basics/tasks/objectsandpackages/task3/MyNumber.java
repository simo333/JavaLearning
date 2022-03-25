package javalearning.samouczekprogramisty.basics.tasks.objectsandpackages.task3;

public class MyNumber {
    private double number;

    public MyNumber(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    //Task4
    public boolean isOdd() {
        if(number < 0)
            throw new IllegalArgumentException("Negative value is forbidden.");
        return number % 2 == 1;
    }

    //Task5
    public boolean isEven() {
        if(number < 0)
            throw new IllegalArgumentException("Negative value is forbidden.");
        return number % 2 == 0;
    }

    //Task6
    public double sqrt(){
        if(number < 0)
            throw new IllegalArgumentException("Negative value is forbidden.");
        return Math.sqrt(number);
    }

    //Task7
    public double pow(MyNumber expotent) {
        return Math.pow(number, expotent.getNumber());
    }

    //Task8
    public MyNumber add(MyNumber component) {
        return new MyNumber(number + component.getNumber());
    }

    //Task9
    public MyNumber substract(MyNumber subtrahend){
        return new MyNumber(number - subtrahend.getNumber());
    }

}
