package javalearning.samouczekprogramisty.basics.tasks.loopsandconditionals.task8;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int [][] arrayMatrix = getIdentityMatrix(10);
        for(int[] i : arrayMatrix)
            System.out.println(Arrays.toString(i));
    }
    public static int[][] getIdentityMatrix(int size){
        if(size <= 0){
            throw new IllegalArgumentException("Negative or zero values are forbidden.");
        }
        int[][] result = new int[size][size];
        for(int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                result [i][j] = 0;
                if(i == j)
                    result[i][j] = 1;
            }
        }
        return result;
    }


}
