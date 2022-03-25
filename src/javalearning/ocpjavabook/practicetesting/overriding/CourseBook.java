package javalearning.ocpjavabook.practicetesting.overriding;

import java.io.IOException;

public class CourseBook extends Book {
    boolean onlyForReference;
    CourseBook(boolean val) {
        onlyForReference = val;
    }

    @Override
    void issueBook(int days) {
        if(onlyForReference)
            System.out.println("Reference book");
        else
            if(days < 14)
                super.issueBook(days);
            else
                System.out.println("days >= 14");
    }

    void review() {}
    void read() throws IOException {}
    void close() throws  Error {}
    void write() throws  RuntimeException {}
    void skip() throws SubtypeIOException {} //Exception      -> fails
    void modify() throws Error {}            //IOException {} -> fails

    static void printName() {
        System.out.println("CourseBook");
    }
}
