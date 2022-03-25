package javalearning.samouczekprogramisty.intermediate.threads.task2;

public class Task2 {
    public static void main(String[] args) {
        new ReversedNestedThread(5).start();
    }
}

class ReversedNestedThread extends Thread {
    private final int children;

    public ReversedNestedThread(int children) {
        this.children = children;
    }

    @Override
    public void run() {
        if(children > 0) {
            ReversedNestedThread childThread = new ReversedNestedThread(children - 1);
            childThread.start();
            try {
                childThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName());
        }
    }
}
