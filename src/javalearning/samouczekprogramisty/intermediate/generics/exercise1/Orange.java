package javalearning.samouczekprogramisty.intermediate.generics.exercise1;

public class Orange extends Fruits {

    public void peelOrange() {
        System.out.println("Cut cut cut ORANGE.");
    }

    @Override
    public String toString() {
        return "I am an orange.";
    }
}
