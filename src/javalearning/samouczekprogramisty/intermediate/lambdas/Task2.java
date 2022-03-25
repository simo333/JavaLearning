package javalearning.samouczekprogramisty.intermediate.lambdas;

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Object object = new Object();
        Object object2 = new Object();
        Object object3 = object;
        Predicate<Object> myObjIsEqualTo = object::equals;
        System.out.println(myObjIsEqualTo.test(object2));
        System.out.println(myObjIsEqualTo.test(object3));
        System.out.println();
    }
}
