package javalearning.ocpjavabook.practicetesting.exceptions.trywithresources;

public class AutoClose3 {
    void useCustomResources() throws Exception {
        try(MyAutoCloseableRes res = new MyAutoCloseableRes();){
            System.out.println("within try-with-resources");
        }
        finally {
            System.out.println("finally");
        }
    }
}
