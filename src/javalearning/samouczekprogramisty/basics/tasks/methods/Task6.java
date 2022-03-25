package javalearning.samouczekprogramisty.basics.tasks.methods;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(powerOfThree(2));
        System.out.println(powerOfThree(3));
    }

    static double powerOfThree(double a){
        return Math.pow(a, 3);
    }
}
