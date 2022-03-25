package javalearning.ocpjavabook.practicetesting.accessmodifiers.publicaccess.library;

//Public class Book with public variable and method
public class Book {
    public Book(){
        isbn = "isbnvariable";

    }
    public String isbn;
    public void printBook() {
        System.out.println("The value of isbn is: " + isbn);
    }
}
