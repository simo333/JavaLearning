package javalearning.ocpjavabook.practicetesting.iofundamentals.characterstreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadChars {
    public static void main(String[] args) throws IOException {
        try (
                FileReader input = new FileReader("ReadChars.java");
                FileWriter output = new FileWriter("CopyReadChars.java");
        ) {
            int data;

            while((data = input.read()) != -1) {
                output.write(data);
            }
        }

    }
}
