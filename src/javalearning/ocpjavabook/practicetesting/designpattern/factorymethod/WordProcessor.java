package javalearning.ocpjavabook.practicetesting.designpattern.factorymethod;

public class WordProcessor implements App{
    @Override
    public void open(String filename) {
        System.out.println("Launch WP using "+ filename);
    }
}
