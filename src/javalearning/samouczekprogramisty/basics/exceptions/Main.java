package javalearning.samouczekprogramisty.basics.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean correct = false;
        while(!correct) {
            System.out.println("Podaj liczbe:");
            try {
                double number = scan.nextDouble();
                if(number < 0)
                    throw new IllegalArgumentException();
                correct = true;
                System.out.println("Pierwiastek z " + number + " = " + Math.sqrt(number));
            } catch (InputMismatchException | IllegalArgumentException exc) {
                System.out.println("Zle!");
                scan.nextLine();
                correct = false;
            }
        }
    }
}
