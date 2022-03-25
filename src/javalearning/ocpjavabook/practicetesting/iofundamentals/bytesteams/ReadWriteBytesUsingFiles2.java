package javalearning.ocpjavabook.practicetesting.iofundamentals.bytesteams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteBytesUsingFiles2 {
    public static void main(String[] args) throws IOException {
        try (
            FileInputStream in = new FileInputStream("C:\\Users\\SimoPc\\IdeaProjects\\AccessModifiers\\IOTests1\\CreateDirectory\\MyText.txt");
            FileOutputStream out = new FileOutputStream("C:\\Users\\SimoPc\\IdeaProjects\\AccessModifiers\\IOTests1\\CreateDirectory\\MyText2.txt");
        ) {
            int data;
            byte[] byteArr = new byte[1024];

            while ((data = in.read(byteArr)) != -1) out.write(byteArr, 0, data);
        }
    }
}
