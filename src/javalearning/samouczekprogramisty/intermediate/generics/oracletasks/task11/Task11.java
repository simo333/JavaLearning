package javalearning.samouczekprogramisty.intermediate.generics.oracletasks.task11;

public class Task11 {
    public static void main(String[] args) {
        Node<String> node = new Node<>();
        Comparable<String> comp = node;
    }
}

class Node<T> implements Comparable<T> {

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
