package javalearning.samouczekprogramisty.basics.tasks.methods;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(sqrt(9));
        System.out.println(sqrt(0));
        System.out.println(sqrt(-9));
    }

    static double sqrt(double a){
        if(a < 0)
            throw new IllegalArgumentException("Negative value is forbidden.");
        return Math.sqrt(a);
    }
}
