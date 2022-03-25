package javalearning.ocpjavabook.practicetesting.threads;

public class OnlineReturn extends Thread{
    private Book book;
    public OnlineReturn(Book book){
        this.book = book;
    }

    @Override
    public void run() {
        book.returnBook();
    }
}
