package javalearning.ocpjavabook.practicetesting.exceptions.throwsclause;

public class Test2 {
    public static void main(String[] args) {
        RuntimeException re = new RuntimeException();
        re.readFile(null);
    }
}
