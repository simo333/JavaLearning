package javalearning.ocpjavabook.practicetesting.accessmodifiers.publicaccess.building;
import javalearning.ocpjavabook.practicetesting.accessmodifiers.publicaccess.library.Book;

//Class House using public class Book and its variable and method
public class House {
    public House() {
        Book book = new Book();
        String value = book.isbn;
        book.printBook();
    }

    public static void main(String args[]) {
        House house = new House();
    }
}
