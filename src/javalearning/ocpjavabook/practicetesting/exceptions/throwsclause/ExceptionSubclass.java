package javalearning.ocpjavabook.practicetesting.exceptions.throwsclause;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionSubclass {
    public void readFile(String file) throws IOException {
        boolean found = findFile(file);
        if(!found)
            throw new FileNotFoundException("Missing file");
        else
            System.out.println("Read file");

    }

    boolean findFile(String file){
        return false;
    }
}
