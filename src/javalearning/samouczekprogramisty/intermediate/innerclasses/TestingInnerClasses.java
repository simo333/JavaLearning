package javalearning.samouczekprogramisty.intermediate.innerclasses;

public class TestingInnerClasses {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner0 = outer.new Inner();
        Outer.Inner inner = new Outer().new Inner();

        Outer.Nested nested = new Outer.Nested();
    }


}

class Outer {
    private int a = 1;
    public int b = 2;

    public Outer() {
        System.out.println("Outer class created.");
    }

    class Inner {
        public int c = 5;


        public Inner() {
            System.out.println("Inner class created.");
        }
    }

    static class Nested {
        public int d = 10;
        static int e = 15;

        public Nested() {
            System.out.println("Static nested class Created!");
        }
    }
}
