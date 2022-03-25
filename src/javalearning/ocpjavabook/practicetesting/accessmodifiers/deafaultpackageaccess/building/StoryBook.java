package javalearning.ocpjavabook.practicetesting.accessmodifiers.deafaultpackageaccess.building;

import javalearning.ocpjavabook.practicetesting.accessmodifiers.deafaultpackageaccess.library.Book;

public class StoryBook extends Book {
    //int c = issueCount; -> cannot access
    //issueHistory(); -> cannot access
}
