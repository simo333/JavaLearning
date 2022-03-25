package javalearning.ocpjavabook.practicetesting.accessmodifiers.protectedaccess.building;

import javalearning.ocpjavabook.practicetesting.accessmodifiers.protectedaccess.library.Book;

public class House {
    public House() {
        Book book = new Book();
        //book.author -> cannot access
        //book.modifyTemplate() -> cannot access
    }

}
