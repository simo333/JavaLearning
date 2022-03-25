package javalearning.ocpjavabook.practicetesting.exceptions.throwsclause;

import java.io.IOException;
import java.sql.SQLException;

public class RethrowException {
    public static void main(String[] args) throws IOException, SQLException {
        String source = "DBMS";
        try {
            if(source.equals("DBMS"))
                throw new SQLException();
            else
                throw new IOException();
        } catch (Exception e) {
            throw e;
        }
    }
}
