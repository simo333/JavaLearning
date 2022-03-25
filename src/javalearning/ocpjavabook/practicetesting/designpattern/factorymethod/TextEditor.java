package javalearning.ocpjavabook.practicetesting.designpattern.factorymethod;

public class TextEditor implements App{
    @Override
    public void open(String filename) {
        System.out.println("Launch TE using " + filename);
    }
}
