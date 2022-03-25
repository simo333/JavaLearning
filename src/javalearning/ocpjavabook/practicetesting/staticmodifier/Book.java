package javalearning.ocpjavabook.practicetesting.staticmodifier;

public class Book {
    static int bookCount;// = setCount();

    public Book() {
        ++bookCount;
    }

    static int setCount() {
        return 0;
    }

    public static void setBookCount(int bookCount) {
        Book.bookCount = bookCount;
    }

    static {
        bookCount = 5;
    }
}
