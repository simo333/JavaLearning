package javalearning.samouczekprogramisty.basics.tasks.methods;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(isDivisibleBy3And5(15));
        System.out.println(isDivisibleBy3And5(30));
    }

    static boolean isDivisibleBy3And5(int a) {
        if(a == 0)
            throw new IllegalArgumentException("Zero value is forbidden.");
        return a % 3 == 0 && a % 5 == 0;
    }
}
