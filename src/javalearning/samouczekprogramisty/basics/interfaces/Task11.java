package javalearning.samouczekprogramisty.basics.interfaces;

public class Task11 implements Computation {

    @Override
    public double compute(double argument1, double argument2) {
        return argument1 + argument2;
    }
}
