package javalearning.ocpjavabook.practicetesting.generics.wildcard.boundedwildcard;

public class Book extends Gift{
    String title;
    Book(String title){
        this.title = title;
    }
    Book(){
        this("Empty - no book title entered");
    }

    @Override
    public String toString() {
        return title;
    }
}
