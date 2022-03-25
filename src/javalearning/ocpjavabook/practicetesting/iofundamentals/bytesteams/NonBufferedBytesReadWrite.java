package javalearning.ocpjavabook.practicetesting.iofundamentals.bytesteams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class NonBufferedBytesReadWrite {
    public static void main(String[] args) throws IOException {
        try (
                FileInputStream in = new FileInputStream("C:\\Users\\SimoPc\\IdeaProjects\\AccessModifiers\\IOTests1\\CreateDirectory\\speed test.txt");
                FileOutputStream out = new FileOutputStream("C:\\Users\\SimoPc\\IdeaProjects\\AccessModifiers\\IOTests1\\CreateDirectory\\speed test - copy.txt");
        )
        {
            long start = System.currentTimeMillis();
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }
            long end = System.currentTimeMillis();
            System.out.println("MilliSeconds elapsed : " + (end-start));
        }
    }
}
