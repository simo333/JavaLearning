package javalearning.samouczekprogramisty.basics.tasks.objectsandpackages.task1;

public class Human {
    public enum Sex {MALE, FEMALE}

    private final String name;
    private final int age;
    private double weight;
    private double height;
    private final Sex sex;

    public Human(String name, int age, double weight, double height, Sex sex) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMale() {
        return sex.equals(Sex.MALE);
    }
}
