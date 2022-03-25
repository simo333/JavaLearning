package javalearning.ocpjavabook.practicetesting.accessmodifiers.protectedaccess.library;

public class Librarian {
    public Librarian() {
        Book book = new Book();
        book.author = "ABC";
        book.modifyTemplate();
    }
}
