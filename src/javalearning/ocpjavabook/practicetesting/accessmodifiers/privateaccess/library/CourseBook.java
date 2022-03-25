package javalearning.ocpjavabook.practicetesting.accessmodifiers.privateaccess.library;

public class CourseBook extends Book {
    public CourseBook() {
        modifyTemplate();
        //countPages(); -> cannot access
    }
}
