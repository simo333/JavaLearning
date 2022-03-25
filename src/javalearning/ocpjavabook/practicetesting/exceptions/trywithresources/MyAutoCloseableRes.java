package javalearning.ocpjavabook.practicetesting.exceptions.trywithresources;

public class MyAutoCloseableRes implements AutoCloseable{
    MyAutoCloseableRes() {
        System.out.println("Constructor called");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Close called");
    }
}
