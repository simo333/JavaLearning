package javalearning.samouczekprogramisty.basics.tasks.primitivetypes.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Type an integer: ");
            int number = scanner.nextInt();
            System.out.println(Integer.toBinaryString(number));
        } catch (InputMismatchException e){
            System.out.println(e);
        }

    }
}
