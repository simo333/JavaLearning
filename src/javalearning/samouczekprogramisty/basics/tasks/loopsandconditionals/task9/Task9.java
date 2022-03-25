package javalearning.samouczekprogramisty.basics.tasks.loopsandconditionals.task9;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        showArray(new int[]{1,2,3,4,5,6,7,8,9});
    }

    static void showArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
}
