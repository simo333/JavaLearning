package javalearning.ocpjavabook.practicetesting.nio2.paths.relativize;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizePath {
    public static void main(String[] args) {
        Path dir = Paths.get("code");
        Path file = Paths.get("code\\java\\IO.java");
        System.out.println(file.relativize(dir));
        System.out.println(dir.relativize(file));

        System.out.println();
        dir = Paths.get("\\code");
        file = Paths.get("\\java\\IO.java");
        System.out.println(file.relativize(dir));
        System.out.println(dir.relativize(file));

        System.out.println();
        dir = Paths.get("\\code\\IO.java");
        file = Paths.get("\\java\\IO.java");
        System.out.println(file.relativize(dir));
        System.out.println(dir.relativize(file));

        Path test = dir.relativize(file).toAbsolutePath().normalize();
        System.out.println(test);
    }
}
