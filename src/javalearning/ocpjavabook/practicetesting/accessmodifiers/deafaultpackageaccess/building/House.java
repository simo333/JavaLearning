package javalearning.ocpjavabook.practicetesting.accessmodifiers.deafaultpackageaccess.building;

import javalearning.ocpjavabook.practicetesting.accessmodifiers.deafaultpackageaccess.library.Book;

public class House {
    Book book = new Book();
    //int c = book.issueCount <- cannot access
    //book.issueHistory(); <- cannot access
}
