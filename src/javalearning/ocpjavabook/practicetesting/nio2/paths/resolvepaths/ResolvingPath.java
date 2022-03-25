package javalearning.ocpjavabook.practicetesting.nio2.paths.resolvepaths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvingPath {
    public static void main(String[] args) {
        Path path = Paths.get("users\\project");
        System.out.println(path.resolve(Paths.get("world\\Hello.java")));
        System.out.println(path.resolve("\\world\\Hello.java"));

        Path absolutePath = Paths.get("E:\\OCP\\");
        System.out.println(absolutePath.resolve(path));
        System.out.println(path.resolve(absolutePath));
        System.out.println(absolutePath.resolve(Paths.get("\\world\\Hello.java")));
    }


}
