package javalearning.ocpjavabook.practicetesting.accessmodifiers.privateaccess.library;

public class Librarian {
    public Librarian () {
        Book book = new Book();
        book.modifyTemplate();
        //book.countPages(); -> cannot access
    }

}
