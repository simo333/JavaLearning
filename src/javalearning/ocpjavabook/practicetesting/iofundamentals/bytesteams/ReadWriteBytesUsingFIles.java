package javalearning.ocpjavabook.practicetesting.iofundamentals.bytesteams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteBytesUsingFIles {
    public static void main(String[] args) throws IOException {
        try (
        FileInputStream in = new FileInputStream("C:\\Users\\SimoPc\\IdeaProjects\\AccessModifiers\\IOTests1\\CreateDirectory\\MyText.txt");
        FileOutputStream out = new FileOutputStream("C:\\Users\\SimoPc\\IdeaProjects\\AccessModifiers\\IOTests1\\CreateDirectory\\MyText2.txt");
        ) {
            int data;

            while ((data = in.read()) != -1) {
                out.write(data);
            }
        }

    }
}
