package javalearning.samouczekprogramisty.basics.tasks.primitivetypes.task1;

public class Human {
    public enum Sex {MALE, FEMALE}

    private final StringBuilder name;
    private final Integer age;
    private final Double weight;
    private final Double height;
    private final Sex sex;

    public Human(StringBuilder name, Integer age, Double weight, Double height, Sex sex) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
    }

    public StringBuilder getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getHeight() {
        return height;
    }

    public Sex getSex() {
        return sex;
    }

    public Boolean isMale() {
        return sex.equals(Sex.MALE);
    }

    public static void main(String[] args) {
        Human human = new Human(new StringBuilder("szymon"), 25, 85.0, 175.0, Sex.MALE);
        System.out.println(human.isMale());
    }
}
