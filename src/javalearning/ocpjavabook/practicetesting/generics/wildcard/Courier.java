package javalearning.ocpjavabook.practicetesting.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Courier {
    public static void wrapGift(List<?> list) {
        for (Object item : list){
            System.out.println("GiftWrap - " + item);
        }
    }

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Oracle"));
        bookList.add(new Book("Java"));
        wrapGift(bookList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Paul");
        stringList.add("Shreya");
        wrapGift(stringList);

    }
}
