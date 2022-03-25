package javalearning.ocpjavabook.practicetesting.designpattern.simplefactory;

public class TextEditor implements App{
    @Override
    public void open(String filename) {
        System.out.println("Launch TextEditor using " + filename);
    }

    @Override
    public void close(String filename) {
        System.out.println("Close TextEditor: " + filename);
    }
}
