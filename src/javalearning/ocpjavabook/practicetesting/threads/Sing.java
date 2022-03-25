package javalearning.ocpjavabook.practicetesting.threads;

public class Sing implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            if (i % 2 == 0) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Singing....................");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
