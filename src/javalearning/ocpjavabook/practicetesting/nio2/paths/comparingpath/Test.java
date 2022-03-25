package javalearning.ocpjavabook.practicetesting.nio2.paths.comparingpath;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        Path file = Paths.get("..\\8-1.txt");
        Path path = file.toAbsolutePath();
        System.out.println(path);
        path = path.normalize();
        System.out.println(path);


    }
}
