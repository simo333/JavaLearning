package javalearning.samouczekprogramisty.intermediate.formatter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Task1 {
    public static void main(String[] args) {
        Path csvFile = Paths.get("C:\\Users\\SimoPc\\Desktop\\test.csv");
        try {
            List<List<String>> list = Files.lines(csvFile)
                    .map(s -> Arrays.stream(s.split(",")).collect(Collectors.toList()))
                    .collect(Collectors.toList());

            list.forEach(s ->
                    System.out.format("| %-8s | %-7.2f | %-12s |%n", s.get(0), Float.parseFloat(s.get(1)), s.get(2)));
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }
}
