package javalearning.ocpjavabook.practicetesting.exceptions.trywithresources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AutoClose {
    void readFileContent(String fileName) {
        File file = new File(fileName);
        try (FileInputStream fin = new FileInputStream(file)) {
            System.out.println("Inside try block");
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("Finally1");
        }
    }
}
