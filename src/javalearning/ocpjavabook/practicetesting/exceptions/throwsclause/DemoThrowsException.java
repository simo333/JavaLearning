package javalearning.ocpjavabook.practicetesting.exceptions.throwsclause;

import java.io.FileNotFoundException;

public class DemoThrowsException {
    public void readFile(String file) throws FileNotFoundException {
        boolean found = findFile(file);
        if(!found)
            throw new FileNotFoundException("Missing file");
        else System.out.println("Reading file");
    }

    boolean findFile(String file) {
        return false;
    }
}
