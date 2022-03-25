package javalearning.ocpjavabook.practicetesting.collectionsfw.compare;

import java.util.Iterator;
import java.util.TreeSet;

public class TestComparable {
    public static void main(String[] args){
        TreeSet<Person> set = new TreeSet<>();

        set.add(new Person("Szymon", 25));
        set.add(new Person("Lukasz", 30));
        set.add(new Person("Damian", 23));

        Iterator<Person> iterator = set.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
