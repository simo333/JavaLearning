package javalearning.ocpjavabook.practicetesting.accessmodifiers.privateaccess.building;

import javalearning.ocpjavabook.practicetesting.accessmodifiers.privateaccess.library.Book;

public class StoryBook extends Book {
    public StoryBook() {
        modifyTemplate();
        //countPages();  <- cannot access
    }
}
