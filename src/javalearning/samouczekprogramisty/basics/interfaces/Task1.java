package javalearning.samouczekprogramisty.basics.interfaces;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 main = new Task1();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Task12(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new Task11(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Result: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Do you want to multiply or add? Enter 1 to multiply or 2 to add: ");
        Scanner scan = new Scanner(System.in);
        int choose = 0;
        while(choose != 1 || choose != 2) {
            choose = scan.nextInt();
            if (choose == 1) {
                System.out.println("Multiplication:");
                return true;
            }
            else if (choose == 2) {
                System.out.println("Addition:");
                return false;
            }
        }
        return false;
    }

    private double getArgument() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        return scan.nextDouble();
    }
}
