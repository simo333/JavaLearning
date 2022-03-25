package javalearning.ocpjavabook.practicetesting.exceptions.trywithresources;

public class MyResource implements AutoCloseable{
    String name;
    MyResource(String name) {
        this.name = name;
        System.out.println("Created: " + name);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed: " + name);
    }
}
