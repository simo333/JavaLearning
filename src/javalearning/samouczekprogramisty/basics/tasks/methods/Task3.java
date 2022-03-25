package javalearning.samouczekprogramisty.basics.tasks.methods;

public class Task3 {
    public static void main(String[] args) {
        compute(3, 2);
        compute(6, 0);
    }

    static void compute(double a, double b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
    }
}
