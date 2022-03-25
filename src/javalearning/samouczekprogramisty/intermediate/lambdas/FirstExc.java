package javalearning.samouczekprogramisty.intermediate.lambdas;

public class FirstExc {
    public static void main(String[] args) {
        InterFace interFace = () -> "yo";
    }
}

interface InterFace {
    String hello();
}