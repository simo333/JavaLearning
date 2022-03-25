package javalearning.samouczekprogramisty.basics.tasks.loopsandconditionals.task3;

public class Task3 {
    private int size;

    public Task3(int size) {
        if(size <= 0)
            throw new IllegalArgumentException("Negative or zero values are forbidden.");
        this.size = size;
    }

    public int[] oneDimension(){
        return new int[size];
    }

    public int[][] twoDimensions(){
        return new int[size][size];
    }



}
