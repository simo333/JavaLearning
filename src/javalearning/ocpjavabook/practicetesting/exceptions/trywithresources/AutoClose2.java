package javalearning.ocpjavabook.practicetesting.exceptions.trywithresources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AutoClose2 {

    void readFileContents(String fileName) throws IOException {
        File file = new File(fileName);
        try (FileInputStream fin = new FileInputStream(file)) {
            System.out.println("Inside try block2");
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("Finally2");
        }
    }


}
