package javalearning.ocpjavabook.practicetesting.iofundamentals.characterstreams;

import java.io.*;

public class BufferedReaderWriter {
    public static void main(String[] args) {
        try (
            FileReader fr = new FileReader("C:\\Users\\SimoPc\\IdeaProjects\\AccessModifiers\\IOTests1\\CreateDirectory\\MyText.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("C:\\Users\\SimoPc\\IdeaProjects\\AccessModifiers\\IOTests1\\CreateDirectory\\MyText2.txt");
            BufferedWriter bw = new BufferedWriter(fw);
        ) {
            String line = null;
            while((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
