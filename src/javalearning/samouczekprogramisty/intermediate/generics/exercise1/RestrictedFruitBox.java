package javalearning.samouczekprogramisty.intermediate.generics.exercise1;

public class RestrictedFruitBox<T extends Fruits> {
    private T object;

    public RestrictedFruitBox(T object) {
        this.object = object;
    }

    public void getIt() {
        System.out.println(object);
    }

    public void getAny() {

    }
}
