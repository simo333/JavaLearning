package javalearning.ocpjavabook.practicetesting.collectionsfw.compare;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        return (person.age - this.age);
    }

    @Override
    public String toString() {
        return name;
    }
}
