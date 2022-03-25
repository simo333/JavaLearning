package javalearning.ocpjavabook.practicetesting.exceptions.multicatch;

public class Exception2 extends Exception implements IEx {

    @Override
    public String info() {
        return "I'm derived Exception";
    }
}
