package javalearning.samouczekprogramisty.intermediate.innerclasses;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task2 {
    public List<String> listOfWords = new LinkedList<>();

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.getWords();
        System.out.println(task2.listOfWords.toString());
        //task2.sortedByStringLengthUsingStreams();
        task2.sortedByStringLength();
        System.out.println(task2.listOfWords.toString());

    }


    public void getWords(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five words:");
        for(int i = 5; i > 0; i--) {
            if (i != 5)
                System.out.println("Enter yet " + i + " words:");
            listOfWords.add(scanner.nextLine());
        }
    }

    public void sortedByStringLengthUsingStreams(){
        listOfWords = listOfWords.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
    }

    public void sortedByStringLength() {
        listOfWords.sort(Comparator.comparing(String::length));
    }


}
