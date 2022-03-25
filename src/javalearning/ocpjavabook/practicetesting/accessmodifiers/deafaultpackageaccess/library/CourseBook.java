package javalearning.ocpjavabook.practicetesting.accessmodifiers.deafaultpackageaccess.library;

public class CourseBook extends Book{
    public CourseBook() {
        int c = issueCount;
        issueHistory();
    }
}
