package javalearning.ocpjavabook.practicetesting.collectionsfw.lists;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

public class DequeArray {

    public static void main(String[] args) {
        String strArray[] = {"A1", "B2", "C3"};

        ArrayDeque<String> arrayDeque = new ArrayDeque<>(Arrays.asList(strArray));
        System.out.println(arrayDeque);
        arrayDeque.add("D4");
        System.out.println(arrayDeque);
        arrayDeque.push("Push");
        arrayDeque.offer("Offer");
        System.out.println(arrayDeque);
        arrayDeque.pop();
        System.out.println(arrayDeque);
        System.out.println("Peek: " + arrayDeque.peek());
        Iterator<String> iterator = arrayDeque.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " : ");
        System.out.println();

        ArrayDeque<String> arrayDeque1 = new ArrayDeque<>(arrayDeque);
        arrayDeque1.addAll(arrayDeque);
        System.out.println(arrayDeque1);
    }
}
