package javalearning.ocpjavabook.practicetesting.threads;

public class SingAndDance {
    public static void main(String[] args) throws InterruptedException {
        Thread sing = new Thread(new Sing());
        sing.start();
        for(int i = 0; i<100; i++) {
            System.out.println("Dancing");
        }
    }
}
