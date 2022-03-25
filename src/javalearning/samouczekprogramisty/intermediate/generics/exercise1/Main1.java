package javalearning.samouczekprogramisty.intermediate.generics.exercise1;

public class Main1 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Car car = new Car();

        FruitBox<Apple> fruitBox = new FruitBox<>(apple);
        fruitBox = new FruitBox<>(new Apple());

        RestrictedFruitBox<Apple> appleRestrictedFruitBox = new RestrictedFruitBox<>(apple);
        appleRestrictedFruitBox.getIt();
    }
}
