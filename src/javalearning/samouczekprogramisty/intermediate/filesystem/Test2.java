package javalearning.samouczekprogramisty.intermediate.filesystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\SimoPc\\Desktop\\aaaa.txt";
        BufferedReader bufferedReader = null;
        String fileContent = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            fileContent = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null)
                bufferedReader.close();
        }
        System.out.println("The file contains: " + fileContent);
    }
}
