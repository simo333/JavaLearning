package javalearning.ocpjavabook.practicetesting.overriding;

import java.io.IOException;

public class Book {
    void issueBook(int days) {
        if(days > 0)
            System.out.println("Book issued");
        else
            System.out.println("Cannot issue for 0 or less days");
    }

    void review() throws Exception {}
    void read() throws Exception {}
    void close() throws  Exception {}
    void write() throws  NullPointerException {}
    void skip() throws IOException {}
    void modify() {}

    static void printName() {
        System.out.println("Book");
    }
}
