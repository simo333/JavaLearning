package javalearning.samouczekprogramisty.basics.tasks.loopsandconditionals.task4;

public class Task4 {
    public void printNumbersReversed(double... numbers){
        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}
