package javalearning.ocpjavabook.practicetesting.exceptions.multicatch;

import java.io.IOException;

public class Exception1 extends IOException implements IEx {
    @Override
    public String info() {
        return "I'm Base Exception";
    }
}
