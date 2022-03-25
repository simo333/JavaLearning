package javalearning.samouczekprogramisty.intermediate.generics.exercise1;

public class FruitBox<T> {
    public T fruit;

    public FruitBox(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }

}
