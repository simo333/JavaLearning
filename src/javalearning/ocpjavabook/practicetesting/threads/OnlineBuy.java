package javalearning.ocpjavabook.practicetesting.threads;

public class OnlineBuy extends Thread {
    private Book book;
    public OnlineBuy(Book book){
        this.book = book;
    }

    @Override
    public void run() {
        book.newSale();
    }
}
