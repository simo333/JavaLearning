package javalearning.ocpjavabook.practicetesting.lambdaexpressions;

public class Test3 {
    public static void main(String[] args) {
        char[] val = {'a', 'b', 'c'};
        Factory factory1 = Lambda1::lambdaStaticMethod;
        Lambda1 lambda1 = new Lambda1();
        Factory factory2 = lambda1::lambdaMethod;
        Factory2 factory3 = Lambda1::new;

        System.out.println(factory1.create(val));
        System.out.println(factory2.create(val));
        factory3.show();
    }
}
