package javalearning.ocpjavabook.practicetesting.designpattern.singleton;

public class SingletonType1 {
    private static SingletonType1 anInstance = null;

    public static SingletonType1 getInstance() {
        if(anInstance == null)
            anInstance = new SingletonType1();
        return anInstance;
    }

    private SingletonType1(){
        System.out.println("Private Constructor Type 1");
    }
}
