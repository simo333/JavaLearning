package javalearning.samouczekprogramisty.basics.interfaces;

public class Task12 implements Computation{
    @Override
    public double compute(double argument1, double argument2) {
        return argument1 * argument2;
    }
}
