package javalearning.ocpjavabook.practicetesting.exceptions.throwsclause;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        DemoThrowsException exception = new DemoThrowsException();

        try {
            exception.readFile("txt");
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
    }
}
