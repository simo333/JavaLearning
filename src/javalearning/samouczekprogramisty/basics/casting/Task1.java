package javalearning.samouczekprogramisty.basics.casting;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Wprowadź liczbę całkowitą: ");
        int number = scan.nextInt();
        int intResult = (int) (number * Math.PI);
        double doubleResult = number * Math.PI;

        System.out.println(intResult);
        System.out.println(doubleResult);
    }
}
