package javalearning.ocpjavabook.practicetesting.accessmodifiers.privateaccess.library;

public class Book {
    private void counterPages() {}
    protected void modifyTemplate() {
        counterPages();
    }

}
