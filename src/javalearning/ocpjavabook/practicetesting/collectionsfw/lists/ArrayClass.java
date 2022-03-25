package javalearning.ocpjavabook.practicetesting.collectionsfw.lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ArrayClass {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Szymon");
        arrayList.add("Adrian");
        arrayList.add("Bob");

        System.out.println(arrayList);
        System.out.println();


        List<String> arrayList2 = new ArrayList<>(arrayList);
        System.out.println("List2: " + arrayList2);

        arrayList.add(1, "Celina");
        System.out.println(arrayList);

        arrayList.add("Szymon");
        System.out.println(arrayList);

        arrayList2.addAll(arrayList);
        System.out.println("List2: " + arrayList2);

        System.out.println(arrayList.subList(2,4));
        System.out.println("To remove: " + arrayList);

        arrayList.removeAll(new ArrayList<>(arrayList.subList(2,4)));
        System.out.println("after removeAll(): " + arrayList);

        arrayList2.set(4, "Celineczka");
        System.out.println("Set: " + arrayList2);

        arrayList2.sort(Comparator.naturalOrder());
        System.out.println("Sorting: " + arrayList2);
        arrayList2.sort(Comparator.reverseOrder());
        System.out.println("Reverse sorting: " + arrayList2);

        ListIterator<String> listIterator = arrayList2.listIterator();
        while(listIterator.hasNext())
            System.out.println(listIterator.next());
    }
}
