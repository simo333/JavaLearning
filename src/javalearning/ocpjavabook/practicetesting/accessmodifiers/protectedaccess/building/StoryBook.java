package javalearning.ocpjavabook.practicetesting.accessmodifiers.protectedaccess.building;

import javalearning.ocpjavabook.practicetesting.accessmodifiers.protectedaccess.library.Book;

public class StoryBook extends Book {
    public StoryBook() {
        author = "ABC";
        modifyTemplate();
    }
}
