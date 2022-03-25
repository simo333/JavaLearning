package javalearning.ocpjavabook.practicetesting.designpattern.simplefactory;

public class Archives implements App{

    @Override
    public void open(String filename) {
        System.out.println("Launch Archives using " + filename);
    }

    @Override
    public void close(String filename) {
        System.out.println("Close Archives: " + filename);
    }
}
