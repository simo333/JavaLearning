package javalearning.ocpjavabook.practicetesting.designpattern.factorymethod;

public class TextEditAppFactory extends AppFactory{
    @Override
    public App getApp() {
        return new TextEditor();
    }
}
