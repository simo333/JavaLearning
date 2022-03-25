package javalearning.ocpjavabook.practicetesting.designpattern.simplefactory;

public class WordProcessor implements App{
    @Override
    public void open(String filename) {
        System.out.println("Launch WordProcessor using " + filename);
    }

    @Override
    public void close(String filename) {
        System.out.println("Close WordProcessor: " + filename);
    }
}
