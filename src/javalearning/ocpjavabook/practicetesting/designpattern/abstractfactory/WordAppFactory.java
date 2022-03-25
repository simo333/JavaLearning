package javalearning.ocpjavabook.practicetesting.designpattern.abstractfactory;

public class WordAppFactory extends AppFactory{
    @Override
    protected App getApp() {
        return new WordProcessor();
    }

    @Override
    protected Font getFont() {
        return new RichFont();
    }
}
