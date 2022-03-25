package javalearning.ocpjavabook.practicetesting.designpattern.simplefactory;

public class Client {
    public static void main(String[] args) {
        App app = AppFactory.getAppInstance(".doc");
        app.open("Hello.doc");

        App app2 = AppFactory.getAppInstance(".xml");
        app2.open("Hello.xml");

        App app3 = AppFactory.getAppInstance(".7z");
        app3.open("LocalArchives.7z");

        app.close("Hello.doc");
        app2.close("Hello.xml");
        app3.close("LocalArchives.7z");
    }
}
