package javalearning.ocpjavabook.practicetesting.lambdaexpressions;

public class Test2 {
    public static void main(String[] args) {
        String textVar = "Hello Var";
        MyInterface myInterface = text -> {
            System.out.println("Parameter: " + text);
            return text;
        };
        String resultVar = myInterface.method(textVar);
        System.out.println(resultVar);
    }



}
