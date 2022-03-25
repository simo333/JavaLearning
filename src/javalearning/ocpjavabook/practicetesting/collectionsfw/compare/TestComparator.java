package javalearning.ocpjavabook.practicetesting.collectionsfw.compare;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestComparator {
    public static void main(String[] args) {
        TreeSet<Person2> set = new TreeSet<>(
                new Comparator<Person2>() {
                    public int compare(Person2 p1, Person2 p2) {
                        return (p1.age - p2.age);
                    }
                }
        );

        set.add(new Person2("Szymon", 25));
        set.add(new Person2("Zenon", 70));
        set.add(new Person2("Zuza", 2));

        Iterator<Person2> iterator = set.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());


    }


}
