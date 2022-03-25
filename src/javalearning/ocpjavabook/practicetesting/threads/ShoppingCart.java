package javalearning.ocpjavabook.practicetesting.threads;

public class ShoppingCart {
    public static void main(String[] args) throws InterruptedException {
        Book book = new Book("Java");
        Thread task1 = new OnlineBuy(book); task1.start();
        Thread task2 = new OnlineBuy(book); task2.start();
        task1.join();
        if(task1.getState() == Thread.State.TERMINATED)
            task1.start();
        Thread task3 = new OnlineReturn(book); task3.start();
    }
}
