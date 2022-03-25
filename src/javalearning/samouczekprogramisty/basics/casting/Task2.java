package javalearning.samouczekprogramisty.basics.casting;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dwie liczby całkowite:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        double result = (double) number1 / number2;

        System.out.println(result);
    }
}
