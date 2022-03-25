package javalearning.samouczekprogramisty.intermediate.generics.oracletasks.task10;

public class Task10 {
    public static void main(String[] args) {
        Node<Circle> nc = new Node<>();
        // Node<Shape is not a subtype of Node<Circle>; below not compiling
        // Node<Shape> ns = nc;
    }
}


class Shape {
}

class Circle extends Shape {
}

class Rectangle extends Shape {
}

class Node<T> {
}
