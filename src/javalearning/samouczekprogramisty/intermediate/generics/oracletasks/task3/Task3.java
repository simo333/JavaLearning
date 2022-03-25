package javalearning.samouczekprogramisty.intermediate.generics.oracletasks.task3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Double[] doubles = new Double[]{2.3, 4.5, 3.2, 7.1, 4.0, 8.8, 9.6};
        System.out.println(Arrays.toString(doubles));
        exchangePosition(doubles, 0, 1);
        System.out.println(Arrays.toString(doubles));
    }

    public static <T> void exchangePosition(T[] arr, int firstPos, int secondPos) {
        if (firstPos == secondPos)
            throw new IllegalArgumentException("Both positions are the same.");
        if (firstPos < 0 || firstPos >= arr.length || secondPos < 0 || secondPos >= arr.length)
            throw new IllegalArgumentException("Wrong arguments passed.");
        T value = arr[firstPos];
        arr[firstPos] = arr[secondPos];
        arr[secondPos] = value;
    }
}
