package javalearning.ocpjavabook.practicetesting.lambdaexpressions;

public class Test1 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("new Lambda Runnable");
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }

}
