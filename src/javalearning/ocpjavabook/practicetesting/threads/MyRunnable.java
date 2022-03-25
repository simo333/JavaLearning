package javalearning.ocpjavabook.practicetesting.threads;

public class MyRunnable implements Runnable{
    private volatile int count = 0;

    @Override
    public void run() {
        for(int i = 0; i<1_000_000; i++){
                count++;

            System.out.println("Thread: " + Thread.currentThread() + " || count: " + count);
        }
    }

    public int getCount() {
        return count;
    }

}
