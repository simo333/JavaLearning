package javalearning.ocpjavabook.practicetesting.innerclass;

public class Tester {

    public static void main (String[] args) {

        System.out.println(new Outer().new Inner().innerInstance);
    }
}
