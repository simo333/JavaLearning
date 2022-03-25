package javalearning.ocpjavabook.practicetesting.exceptions.trywithresources;

public class TestAutoCloseOrder {
    public static void main(String[] args) {
        try (MyResource res1 = new MyResource("1");
             MyResource res2 = new MyResource("2");) {
            System.out.println("withing try-with-resources");
            throw new Exception();
        }
        catch (Exception e) {
            System.out.println("exception");
        }
        finally {
            System.out.println("finally");
        }
    }
}
