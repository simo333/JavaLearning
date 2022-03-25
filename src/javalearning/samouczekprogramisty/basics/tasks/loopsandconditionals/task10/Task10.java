package javalearning.samouczekprogramisty.basics.tasks.loopsandconditionals.task10;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{3, 2, 4, 5, 1})));
    }

    static int[] sortArray(int[] arrayToSort){
        return Arrays.stream(arrayToSort).sorted().toArray();
    }
}
