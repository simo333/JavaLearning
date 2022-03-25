package javalearning.samouczekprogramisty.intermediate.collections.task1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> namesSet = new LinkedHashSet<>();
        String name = "";

        System.out.println("Enter as many names as you want. To stop type \"-\":");
        while (!name.equals("-")) {
            name = scanner.nextLine();
            namesSet.add(name);
        }

        System.out.println("Here's distinct list of the names:");
        namesSet.forEach(System.out::println);
    }
}
