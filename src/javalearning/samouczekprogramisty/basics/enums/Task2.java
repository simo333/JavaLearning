package javalearning.samouczekprogramisty.basics.enums;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        try {
            System.out.println(Computation.ADD.perform(1, -5));
        } catch (IllegalArgumentException iae){
            System.out.println("You cannot divide by 0.");
            System.out.println(Arrays.toString(iae.getStackTrace()));
        }
    }
}
