package javalearning.ocpjavabook.practicetesting.overriding.objectclass;

import java.util.Arrays;

public class Book {
    String title;
    String isbn;
    String[] author;
    double price;
    int version;
    String publisher;

    @Override
    public String toString() {
        return title + ", ISBN:" + isbn + ", Lead Author: " + author[0];
    }
}
