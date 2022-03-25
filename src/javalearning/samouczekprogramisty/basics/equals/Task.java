package javalearning.samouczekprogramisty.basics.equals;

public class Task {
    public static void main(String[] args) {
        Human szymon = new Human("Szymon", "Poniedziałek", 1996, 9606262);
        Human szymon2 = new Human("Szymon", "Poniedzialek", 1996, 9606263);
        Human szymon3 = new Human("Szymon", "Poniedziałek", 1996, 9606262);

        System.out.println(szymon.equals(szymon2));
        System.out.println(szymon.equals(szymon3));
        System.out.println(szymon2.equals(szymon3));
        System.out.println(szymon3.equals(szymon));
        System.out.println(szymon.hashCode() == szymon3.hashCode());



    }
}
