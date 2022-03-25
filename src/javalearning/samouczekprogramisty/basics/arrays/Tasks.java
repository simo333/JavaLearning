package javalearning.samouczekprogramisty.basics.arrays;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
        double[] array = new double[] {3, 5, 10, 21, 330, 20.21, 13.25, 10, 20, 10.3};

        System.out.println(sum(array));
        System.out.println(maxNumber(array));
    }


    //TASK1
    static double sum(double[] arr){
        return Arrays.stream(arr).sum();
    }

    //TASK2
    static double maxNumber(double[] arr){
        return Arrays.stream(arr).max().isPresent() ? Arrays.stream(arr).max().getAsDouble() : 0;
    }
}
