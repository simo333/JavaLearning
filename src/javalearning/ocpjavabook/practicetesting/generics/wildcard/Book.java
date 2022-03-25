package javalearning.ocpjavabook.practicetesting.generics.wildcard;

public class Book extends Gift{
    String title;
    Book(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
