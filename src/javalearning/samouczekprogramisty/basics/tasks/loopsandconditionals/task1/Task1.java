package javalearning.samouczekprogramisty.basics.tasks.loopsandconditionals.task1;

public class Task1 {
    public void showNumbers(int number) {
        if(number <= 0)
            throw new IllegalArgumentException("Negative or zero values are forbidden.");
        for(int i = 0; i <= number; i++)
            System.out.println(i);
    }
}
