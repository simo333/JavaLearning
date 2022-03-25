package javalearning.samouczekprogramisty.basics.tasks.primitivetypes.task3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean correct;
        int size = 0;
        do {
            System.out.print("How big array? - ");
            try {
                size = scanner.nextInt();
                if (size <= 0)
                    throw new IllegalArgumentException("Zero or negative values are forbidden.");
                correct = true;
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("ERROR! Enter a positive integer bigger than 0!");
                System.out.println("##############################################");
                System.out.println();
                correct = false;
                scanner.nextLine();
            }
        } while(!correct);

        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter a number: ");
            try {
                array[i] = scanner.nextInt();
            } catch (InputMismatchException ime){
                System.out.println("No no no. Type an integer.");
                scanner.nextLine();
                i--;
            }
        }
        System.out.println();

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
