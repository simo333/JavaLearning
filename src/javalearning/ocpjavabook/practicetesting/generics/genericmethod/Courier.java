package javalearning.ocpjavabook.practicetesting.generics.genericmethod;

public abstract class Courier {
    public <E> void deliver(E[] array){
        for (E item : array){
            System.out.println("Delivering - " + item);
        }
    }
}
