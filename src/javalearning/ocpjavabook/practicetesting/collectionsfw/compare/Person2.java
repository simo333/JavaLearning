package javalearning.ocpjavabook.practicetesting.collectionsfw.compare;

public class Person2 {
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", lat " + age;
    }
}
