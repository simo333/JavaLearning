package javalearning.samouczekprogramisty.basics.conditionsandloops;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2 , 4};
        System.out.println(sum(arr));
    }

    static int sum(int[] arr){
        return Arrays.stream(arr).sum();
    }
}

