package javalearning.ocpjavabook.practicetesting.iofundamentals.fileio;

import java.io.File;
import java.io.IOException;

public class CreateFileAndDirs {
    public static void main(String[] args) throws IOException {
        File dirs = new File("C:\\Users\\SimoPc\\IdeaProjects\\AccessModifiers\\IOTests1\\CreateDirectory");
        System.out.println(dirs.mkdirs());
        File file = new File(dirs, "MyText.txt");
        if(!file.exists())
            System.out.println(file.createNewFile());
    }
}
