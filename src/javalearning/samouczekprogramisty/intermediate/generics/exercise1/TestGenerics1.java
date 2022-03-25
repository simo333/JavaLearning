package javalearning.samouczekprogramisty.intermediate.generics.exercise1;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics1 {
    public static void main(String[] args) {
        Rectangle squareRectangle = new Square();
        BoxForFigures<Rectangle> rectangleBoxForFigures = new BoxForFigures<>();
        List list = new ArrayList();
        list.add(new Rectangle());
        list.add(new Vehicle<>());

        if (method(5, "some", false)) {
            System.out.println("hello.");
        }

    }

    static <T, G, H> H method(T from, G to, H toReturn) {
        System.out.print("Converts ");
        System.out.print("from: " + from);
        System.out.println(" -> to: " + to);

        return toReturn;
    }
}

class Vehicle<T> {
    T object;

    public Vehicle() {
        System.out.println(object);
    }
}

class Truck extends Vehicle<String> {
}


class Rectangle {
}

class Square extends Rectangle {
}

class BoxForFigures<T> {
    T object;
}


