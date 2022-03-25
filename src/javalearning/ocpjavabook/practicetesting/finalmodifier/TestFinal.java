package javalearning.ocpjavabook.practicetesting.finalmodifier;

public class TestFinal {
    static final int staticFinal;
    static int a, b;

    static {

        if(a>b) staticFinal = 2;
        else if (a>=b) staticFinal = 3;
        else staticFinal = 1;
    }

    private final void testFinal(){
        System.out.println("Final test method of class TestFinal");
    }

    public static void main(String[] args){
        System.out.println(TestFinal.staticFinal);
    }
}
