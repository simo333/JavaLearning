package javalearning.samouczekprogramisty.basics.enums;

public class Human {
    private String name;
    private int age;
    private EyesColor eyesColor;
    private HairColor hairColor;

    public Human(String name, int age, EyesColor eyesColor, HairColor hairColor) {
        this.name = name;
        this.age = age;
        this.eyesColor = eyesColor;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EyesColor getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(EyesColor eyesColor) {
        this.eyesColor = eyesColor;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public void setHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
    }
}
