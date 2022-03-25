package javalearning.samouczekprogramisty.intermediate.threads.task1;

public class Task1 {
    public static void main(String[] args) {
        new NestedThread(3).start();
    }


}

class NestedThread extends Thread {
    private final int children;

    public NestedThread(int children) {
        this.children = children;
    }

    @Override
    public void run() {
        if(children > 0) {
            NestedThread childThread = new NestedThread(children - 1);
            System.out.println(getName());
            childThread.start();
        }
    }
}