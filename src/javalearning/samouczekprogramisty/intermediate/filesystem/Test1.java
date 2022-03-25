package javalearning.samouczekprogramisty.intermediate.filesystem;

import java.io.FileWriter;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\SimoPc\\Desktop\\aaaa.txt";

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write("Ja to napisałem.");
        }
    }
}
