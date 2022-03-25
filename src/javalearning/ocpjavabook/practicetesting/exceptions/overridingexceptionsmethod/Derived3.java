package javalearning.ocpjavabook.practicetesting.exceptions.overridingexceptionsmethod;

import java.io.IOException;

public class Derived3 extends Base{
    @Override
    public void aMetod() throws IOException {
        super.aMetod();
    }
}
