package javalearning.ocpjavabook.practicetesting.designpattern.abstractfactory;

public abstract class AppFactory {
    protected abstract App getApp();
    protected abstract Font getFont();

    public App getAppInstance(){
        App appIn = getApp();
        return appIn;
    }

    public Font getFontInstance() {
        Font font = getFont();
        return font;
    }

}
