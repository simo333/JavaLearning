package javalearning.ocpjavabook.practicetesting.exceptions.multicatch;

public class TestVariableTypeInMultiCatch {
    public static void main(String[] args) {
        try {
            int a = 10;

            if(a <= 10) throw new Exception1();
            else throw new Exception2();
        }
        catch (Exception1 | Exception2 ex) {
            System.out.println(ex);
            System.out.println(ex.info());
        }
    }
}
