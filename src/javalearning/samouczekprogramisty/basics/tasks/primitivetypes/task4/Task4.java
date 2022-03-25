package javalearning.samouczekprogramisty.basics.tasks.primitivetypes.task4;

import javalearning.samouczekprogramisty.basics.tasks.loopsandconditionals.task7.Task7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a word: ");
        String text = scanner.next();

        System.out.println("String length: " + text.length());
        System.out.println("The word " + (Task7.isPalindrome(text) ? "is" : "is not") + " a palindrome.");
        System.out.println("Reversed: " + new StringBuilder(text).reverse());

    }
}
