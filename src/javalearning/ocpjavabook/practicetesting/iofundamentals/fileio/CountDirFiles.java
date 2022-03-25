package javalearning.ocpjavabook.practicetesting.iofundamentals.fileio;

import java.io.File;

public class CountDirFiles {
    public static void main(String[] args) {
        countDirFiles(new File("C:\\Users\\SimoPc\\IdeaProjects\\AccessModifiers\\IOTests1"));
    }

    public static void countDirFiles(File dir) {
        if (dir.isDirectory()) {
            int fileCount = 0;
            int dirCount = 0;
            String[] list = dir.list();
            File item = null;
            for(String listItem : list){
                item = new File(dir, listItem);
                if (item.isFile())
                    ++fileCount;
                else if (item.isDirectory())
                    ++dirCount;
            }
            System.out.println("File count = " + fileCount + " and Dir count = " + dirCount );
            for(String file : list)
                System.out.println(file);
        }
        else {
            throw new IllegalArgumentException("Not a directory");
        }
    }
}
