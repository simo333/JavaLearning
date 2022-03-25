package javalearning.ocpjavabook.practicetesting.innerclass;

public class Outer {
    int outerInstance = 1;
    static int outerStatic = 2;
    String a;

    Outer(){
        System.out.println("Outer constructor");
        //Inner in = new Inner();
        //in.innerInstance = 3;
    }

    {
        System.out.println("Outer init");
    }

    static {
        System.out.println("Outer static init");
    }

    class Inner {
        int innerInstance = 11;
        //static int innerStatic = 12; INNER CLASS CANNOT HAVE STATIC MEMBERS

        Inner(){
            System.out.println("Inner class constructor start:");
            System.out.println(innerInstance);
            innerInstance = 200000;
            System.out.println(innerInstance);
            outerStatic = 0;
            outerInstance = 0;
            System.out.println(outerStatic + " /// " + outerInstance);
            System.out.println("Inner class constructor ends.");
        }

        {
            System.out.println("Inner init");
        }

    }
}
