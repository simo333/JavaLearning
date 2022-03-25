package javalearning.ocpjavabook.practicetesting.exceptions.trywithresources;

public class EJavaFactory {
    public static void main(String[] args) {
        try (Box box = new Box()) {
            box.close();
            box.emptyContents();
        }
    }
}
