package javalearning.ocpjavabook.practicetesting.designpattern.singleton;

public class SingletonEagerInit {
    private static final SingletonEagerInit anInstance = new SingletonEagerInit();

    public static SingletonEagerInit getInstance(){
        return anInstance;
    }

    private SingletonEagerInit(){
        System.out.println("Private Constructor Eager Type");
    }
}
