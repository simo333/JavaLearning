package javalearning.ocpjavabook.practicetesting.designpattern.simplefactory;

public class AppFactory {
    public static App getAppInstance (String fileExtn) {
        App appln = null;
        if (fileExtn.equals(".doc")) {
            appln = new WordProcessor();
        }
        else if ((fileExtn.equals(".txt")) || fileExtn.equals(".xml")) {
            appln = new TextEditor();
        }
        else if (fileExtn.equals(".rar") || fileExtn.equals(".7z")) {
            appln = new Archives();
        }
        return appln;
    }
}
