package javalearning.ocpjavabook.practicetesting.threads;

public class Book {
    String title;
    int copiesSold = 0;
    Book(String title){
        this.title = title;
    }
    synchronized public void newSale(){
        System.out.println("newSale");
        ++copiesSold;
        System.out.println(copiesSold);
    }
    synchronized public void returnBook(){
        System.out.println("returnBook");
        --copiesSold;
        System.out.println(copiesSold);
    }

}
