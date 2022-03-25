package javalearning.samouczekprogramisty.intermediate.generics.oracletasks.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        IntStream.rangeClosed(1, 50).forEach(list::add);

        List<Integer> evenNumbersOnly = countIf(list, n -> n % 2 == 0);
        System.out.println(evenNumbersOnly);
        List<String> wordsList = Arrays.asList("amanta", "senior", "amarena", "tadam", "agnieszka", "troglodyta");
        List<String> onlyWordsStartsWith = countIf(wordsList, n -> n.startsWith("a"));
        System.out.println(onlyWordsStartsWith);
    }

    public static <T> List<T> countIf(List<T> list, Predicate<T> cause) {
        return list.stream()
                .filter(cause)
                .collect(Collectors.toList());
    }
}

