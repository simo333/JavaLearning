package javalearning.ocpjavabook.practicetesting.staticmodifier;

public class Publisher {
    public static void main (String args[]) {
        System.out.println(Book.bookCount);

        Book b1 = new Book();
        Book b2 = new Book();

        System.out.println(Book.bookCount);
        b1.setBookCount(4);
        System.out.println(Book.bookCount);

        Book b3 = new Book();

        System.out.println(Book.bookCount);
    }
}
