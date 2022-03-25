package javalearning.samouczekprogramisty.intermediate.lambdas;

import java.util.function.BiFunction;

public class Task3 {
    public static void main(String[] args) {
        BiFunction<Integer, String, Human> humanCreator = Human::new;
        Human human = humanCreator.apply(25, "Szymon");
        System.out.println(human.getAge());
        System.out.println(human.getName());

    }
}

class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
