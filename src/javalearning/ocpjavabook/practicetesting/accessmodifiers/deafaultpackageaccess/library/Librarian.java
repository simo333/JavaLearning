package javalearning.ocpjavabook.practicetesting.accessmodifiers.deafaultpackageaccess.library;

public class Librarian {
    public Librarian () {
        Book b = new Book();
        int c = b.issueCount;
        b.issueHistory();
    }
}
