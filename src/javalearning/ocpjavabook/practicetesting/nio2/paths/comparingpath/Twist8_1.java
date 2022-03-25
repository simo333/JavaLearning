package javalearning.ocpjavabook.practicetesting.nio2.paths.comparingpath;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Twist8_1 {
    public static void main(String[] args) {
        Path path = Paths.get("c:\\OCP\\..\\obj8\\.\\8-1.txt");
        Path path2 = path.normalize();
        System.out.println(path2.toString());
        System.out.println(path.toString());
        System.out.println(path.getName(1));
        System.out.println(path.getParent());
        System.out.println(path.subpath(2,4));
        System.out.println(path.getFileName());
    }
}
