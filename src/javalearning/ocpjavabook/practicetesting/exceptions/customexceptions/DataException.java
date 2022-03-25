package javalearning.ocpjavabook.practicetesting.exceptions.customexceptions;

import java.sql.SQLException;

public class DataException extends SQLException {
    DataException() {super();}
    DataException(String msg) { super(msg); }
    }
