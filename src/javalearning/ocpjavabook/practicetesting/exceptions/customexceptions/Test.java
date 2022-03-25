package javalearning.ocpjavabook.practicetesting.exceptions.customexceptions;

import java.sql.SQLException;

public class Test {
    void accessData() throws DataException {
        try {
            System.out.println("try");
        }
        catch (Exception e){
            throw new DataException("Error with Data access");
        }
    }
}
