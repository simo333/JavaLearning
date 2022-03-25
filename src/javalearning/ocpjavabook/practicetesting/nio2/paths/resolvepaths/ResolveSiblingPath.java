package javalearning.ocpjavabook.practicetesting.nio2.paths.resolvepaths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveSiblingPath {
    public static void main(String[] args) {
        Path path = Paths.get("\\mydir\\eWorld.java");
        Path renamePath = path.resolveSibling(Paths.get("newWorld.txt"));
        Path copyPath = path.resolveSibling("backup\\eWorld.java");
        Path absolutePath = Paths.get("E:\\OCP\\");

        System.out.println(renamePath);
        System.out.println(copyPath);
        System.out.println(path.resolveSibling(""));

        System.out.println(absolutePath.resolveSibling(path));
        System.out.println(path.resolveSibling(absolutePath));
    }
}
