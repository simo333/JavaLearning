package javalearning.ocpjavabook.practicetesting.generics.wildcard.boundedwildcard;

import java.util.ArrayList;
import java.util.List;

public class Tester {

    public static void wrapGift(List<? extends Gift> list) {
        for(Gift item : list){
            System.out.println("GiftWrap - " + item);
        }
    }
    public static void main(String[] args){
        List<? extends Gift> myList1 = new ArrayList<Gift>();
        List<? extends Gift> myList2 = new ArrayList<Book>();
        List<? extends Gift> myList3 = new ArrayList<Phone>();

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Oracle"));
        bookList.add(new Book("Java"));
        wrapGift(bookList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Paul");
        stringList.add("Shreya");
        //wrapGift(stringList); ? extends Gift != String

        List<? super Gift> myList11 = new ArrayList<Gift>();
        List<? super Gift> myList12 = new ArrayList<Object>();
        // List<? super Gift> myList13 = new ArrayList<Phone>(); Phone is not superclass of Gift
        List<? super Phone> myList14 = new ArrayList<Gift>();

        List<? super Gift> list = new ArrayList<>();
        list.add(new Gift());
        list.add(new Book());
        list.add(new Phone());
        //list.add(new Object()); cannot
        for(Object obj : list) System.out.println(obj);

    }
}
