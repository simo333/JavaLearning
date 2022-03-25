package javalearning.samouczekprogramisty.intermediate.collections.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String name;
        Map<String, String> pairs = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter names of pairs:");
        while (true) {
            System.out.println("/* Type \"-\" now to finish adding new pairs. /*");
            System.out.println("New pair:");
            name = scanner.nextLine();
            if (name.equals("-")) {
                break;
            }
            System.out.print("Second partner: ");
            pairs.put(name, scanner.nextLine());
        }

        System.out.print("Type someone and I will show you the partner: ");
        name = scanner.nextLine();
        if (pairs.containsKey(name))
            System.out.println("The partner is " + pairs.get(name));
        System.out.println("Wrong value.");
    }
}
