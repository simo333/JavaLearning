package javalearning.samouczekprogramisty.basics.conditionsandloops;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task6 {
    public static void main(String[] args) {
        int[][] arr = new int[][] {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};

        System.out.println(sum(arr));
        System.out.println(sumNoStream(arr));
    }

    static int sum(int[][] arr){
        return Arrays.stream(arr).flatMapToInt(IntStream::of).sum();
    }

    static int sumNoStream(int[][] arr){
        int sum = 0;
        for(int[] i : arr) {
            for (int element : i){
                sum += element;
            }
        }
        return sum;
    }
}
