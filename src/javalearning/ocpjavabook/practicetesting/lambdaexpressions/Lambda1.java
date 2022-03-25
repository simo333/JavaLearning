package javalearning.ocpjavabook.practicetesting.lambdaexpressions;

import java.util.Arrays;

public class Lambda1 {
    public Lambda1(){
        System.out.println("Lambda constructor");
    }

    public String lambdaMethod(char[] val){
        return "Lambda method: " + Arrays.toString(val);
    }

    public static String lambdaStaticMethod(char[] val){
        return "Lambda static method: " + Arrays.toString(val);
    }
}
