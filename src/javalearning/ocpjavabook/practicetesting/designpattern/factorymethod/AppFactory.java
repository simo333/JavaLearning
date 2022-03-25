package javalearning.ocpjavabook.practicetesting.designpattern.factorymethod;

public abstract class AppFactory {
    public App getAppInstance(){
        App appln = getApp();
        return appln;
    }

    public abstract App getApp();
}
