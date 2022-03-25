package javalearning.ocpjavabook.practicetesting.accessmodifiers.privateaccess.building;

import javalearning.ocpjavabook.practicetesting.accessmodifiers.privateaccess.library.Book;

public class House {
    public House() {
        Book book = new Book();
        //book.modifyTemplate(); different packages
        //book.countPages();     private access only
    }
}
