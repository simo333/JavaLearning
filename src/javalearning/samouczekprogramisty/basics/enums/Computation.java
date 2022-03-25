package javalearning.samouczekprogramisty.basics.enums;

public enum Computation {
    MULTIPLY, DIVIDE, ADD, SUBTRACT;

    public double perform(double x, double y) throws IllegalArgumentException{
        switch (this){
            case ADD -> { return x + y; }
            case SUBTRACT -> { return x - y; }
            case MULTIPLY -> { return x * y; }
            case DIVIDE -> {
                if(y != 0) {
                    return x / y;
                } else throw new IllegalArgumentException();
            }
        }
        return 0;
    }
}