package javalearning.ocpjavabook.practicetesting.exceptions.trywithresources;

import java.io.IOException;

public class Tester {
    public static void main(String[] args) throws IOException {
        AutoClose autoClose = new AutoClose();
        autoClose.readFileContent("file1.txt");

        AutoClose2 autoClose2 = new AutoClose2();
        autoClose2.readFileContents("file2.txt");
    }
}
