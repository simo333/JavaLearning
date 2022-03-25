package javalearning.ocpjavabook.practicetesting.exceptions.trywithresources;

public class Box implements AutoCloseable{
    public void emptyContents() {
        System.out.println("emptyContents");
    }

    @Override
    public void close() {
        System.out.println("close");
    }
}
