package javalearning.samouczekprogramisty.basics.tasks.loopsandconditionals.task2;

public class Task2 {
    public void showNumbers(int number) {
        if(number <= 0)
            throw new IllegalArgumentException("Negative or zero values are forbidden.");
        int i = 0;
        while(i <= number){
            System.out.println(i);
            i++;
        }
    }
}
