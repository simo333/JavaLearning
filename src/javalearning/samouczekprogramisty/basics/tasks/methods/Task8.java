package javalearning.samouczekprogramisty.basics.tasks.methods;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(canBuildTriangle(1,2,3));
        System.out.println(canBuildTriangle(1,3,3));
        System.out.println(canBuildTriangle(4,2,3));
        System.out.println(canBuildTriangle(3,4,2));
    }

    static boolean canBuildTriangle(double a, double b, double c){
        if(a <= 0 || b <= 0 || c <= 0)
            throw new IllegalArgumentException("Negative or zero values are forbidden.");
        double longest = a;
        double small1 = b;
        double small2 = c;
        if(a < b) {
            if(b < c) {
                longest = c;
                small2 = a;
            } else {
                longest = b;
                small1 = a;
            }
        } else if (a < c) {
            longest = c;
            small2 = a;
        }
        return (small1 + small2) > longest;
    }
}
