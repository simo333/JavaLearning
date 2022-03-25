package javalearning.ocpjavabook.practicetesting.staticinnerclass;

public class Outer {
    String name = "Nazwa";
    static int outerStatic = 3;
    int outerInstance = 4;
    Outer(){
        System.out.println("Outer constructor = " + outerStatic);
    }


    static class StaticNested {
        static int innerStatic = Outer.outerStatic;
        int innerInstance = 2;
        StaticNested(){
            outerStatic = 1;
            innerInstance = 0;
            innerStatic = 999;
            System.out.println("Constructot StaticNested = " + outerStatic + " " + innerStatic + " " + innerInstance);
        }

        {
            outerStatic = 22222;
            innerInstance = 55555;
            innerStatic = 333333;
            System.out.println("Inner init = " + outerStatic + " " + innerStatic + " " + innerInstance);

        }
        static{
            outerStatic = 12;
            innerStatic = 15;
            System.out.println("Inner static init = " + outerStatic + " " + innerStatic);
        }

    }
}
