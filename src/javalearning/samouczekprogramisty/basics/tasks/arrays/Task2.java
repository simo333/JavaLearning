package javalearning.samouczekprogramisty.basics.tasks.arrays;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Task2 task = new Task2();
        System.out.println(Arrays.toString(task.getReversedArray(new double[]{1, 2, 3, 4, 5, 6})));
    }

    public double[] getReversedArray(double[] arr){
        double[] reversedArray = new double[arr.length];
        int i = 0;
        int j = arr.length - 1;
        do{
            reversedArray[i] = arr[j];
            i++; j--;
        } while((i <= arr.length - 1));
        return reversedArray;
    }
}
