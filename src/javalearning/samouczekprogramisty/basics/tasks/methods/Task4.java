package javalearning.samouczekprogramisty.basics.tasks.methods;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        boolean correctly = true;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Type an integer: ");
            int a = scan.nextInt();
            try {
                System.out.println(isEven(a));
                correctly = true;
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
                correctly = false;
                scan.nextLine();
            }
        } while (!correctly);
    }

    static boolean isEven(int a){
        if(a < 0)
            throw new IllegalArgumentException("Negative value is forbidden.");
        return a % 2 == 0;
    }
}
