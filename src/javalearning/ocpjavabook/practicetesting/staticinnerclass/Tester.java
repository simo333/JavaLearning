package javalearning.ocpjavabook.practicetesting.staticinnerclass;

public class Tester {

    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.StaticNested innerStatic = new Outer.StaticNested();
        System.out.println(Outer.StaticNested.innerStatic);
        System.out.println(Outer.outerStatic);
    }
}
