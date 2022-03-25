package javalearning.ocpjavabook.practicetesting.iofundamentals.bytesteams;

import java.io.*;

public class BufferedReadWriteBytes {
    public static void main(String[] args) throws IOException {
        try (
                FileInputStream in = new FileInputStream("C:\\Users\\SimoPc\\IdeaProjects\\AccessModifiers\\IOTests1\\CreateDirectory\\speed test.txt");
                FileOutputStream out = new FileOutputStream("C:\\Users\\SimoPc\\IdeaProjects\\AccessModifiers\\IOTests1\\CreateDirectory\\speed test - copy.txt");
                BufferedInputStream bis = new BufferedInputStream(in);
                BufferedOutputStream bos = new BufferedOutputStream(out);
        )
        {
            long start = System.currentTimeMillis();
            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }
            long end = System.currentTimeMillis();
            System.out.println("MilliSeconds elapsed : " + (end-start));
        }

    }
}
