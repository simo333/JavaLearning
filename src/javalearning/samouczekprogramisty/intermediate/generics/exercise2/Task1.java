package javalearning.samouczekprogramisty.intermediate.generics.exercise2;


import java.util.function.Supplier;

//https://docs.oracle.com/javase/tutorial/java/generics/QandE/generics-questions.html
public class Task1 {
    public static void main(String[] args) {
        Supplier<Testing> testingSupplier = Testing::new;
        testingSupplier.get();
    }
}

class Testing {
    public Testing() {
        System.out.println("Created.");
    }
}

