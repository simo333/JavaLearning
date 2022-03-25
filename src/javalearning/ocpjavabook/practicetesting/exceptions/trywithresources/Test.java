package javalearning.ocpjavabook.practicetesting.exceptions.trywithresources;

public class Test {
    public static void main(String[] args) throws Exception {
        new AutoClose3().useCustomResources();
    }
}
