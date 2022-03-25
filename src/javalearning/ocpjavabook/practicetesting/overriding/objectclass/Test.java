package javalearning.ocpjavabook.practicetesting.overriding.objectclass;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
    /* Testing overriding toString()
        Book b = new Book();
        b.title = "Java Cert";
        b.author = new String[]{"Paul", "Larry"};
        b.isbn = "7260691990";
        System.out.println(b);
    */
    /* Testing overriding equals();
        A a = new A(5);
        A b = new A(5);
        A c = new A(5);

        System.out.println("a = a is " + a.equals(a));
        System.out.println("a = b is " + a.equals(b));
        System.out.println("b = a is " + b.equals(a));
        System.out.println("(a = b) && (b = c) && (c = a) is " + (a.equals(b) && b.equals(c) && c.equals(a)));
        System.out.println("AGAIN a = b is " + a.equals(b));
        System.out.println("!(a = null) && (a = null) is " + ((!a.equals(null)) && a.equals(null)));
    */

        Map<MyNumber, String> map = new HashMap<>();
        MyNumber num1 = new MyNumber(1200);
        MyNumber num2 = new MyNumber(2500);
        MyNumber num3 = new MyNumber(57123);
        map.put(num1, "John");
        map.put(num2, "Mary");
        map.put(num3, "Sam");


    }

}
