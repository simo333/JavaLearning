package javalearning.ocpjavabook.practicetesting.designpattern.abstractfactory;

public class TextEditAppFactory extends AppFactory{
    @Override
    protected App getApp() {
        return new TextEditor();
    }

    @Override
    protected Font getFont() {
        return new RegularFont();
    }
}
