package javalearning.ocpjavabook.practicetesting.threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable runnable1 = new MyRunnable();
        MyRunnable runnable2 = new MyRunnable();

        Thread thread1 = new Thread(runnable1, "Thread1");
        Thread thread2 = new Thread(runnable1, "Thread2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(runnable1.getCount());
        //System.out.println(runnable2.getCount());
    }
}
