package javalearning.samouczekprogramisty.intermediate.lambdas;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 4 strings:");
        for(int i = 0; i < 4; i++)
            list.add(scanner.nextLine());

        list.sort(Comparator.comparing(String::length).reversed());

        System.out.println(list);
    }
}
