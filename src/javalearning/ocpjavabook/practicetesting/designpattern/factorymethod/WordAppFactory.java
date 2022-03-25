package javalearning.ocpjavabook.practicetesting.designpattern.factorymethod;

public class WordAppFactory extends AppFactory{
    @Override
    public App getApp() {
        return new WordProcessor();
    }
}
