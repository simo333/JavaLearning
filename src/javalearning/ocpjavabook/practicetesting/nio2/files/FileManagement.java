package javalearning.ocpjavabook.practicetesting.nio2.files;

import java.nio.file.Paths;

public class FileManagement {
    public static void main(String[] args) {
        CreatingDirsFiles dir = new CreatingDirsFiles(Paths.get("C:\\Users\\SimoPc\\IdeaProjects\\AccessModifiers\\NIO2 Tests\\FileManagement"));
        dir.createDir(Paths.get("Folder 1"));
        dir.createFile("Nowy plik.txt");
        dir.back();
        dir.deleteDir(Paths.get("Folder 1"));
        dir.createFile("Czy powrót.txt");
        dir.moveToDir(Paths.get("sratatata"));
//        dir.backToRoot();
//        dir.backToBase();
    }
}
