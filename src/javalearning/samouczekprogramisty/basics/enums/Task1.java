package javalearning.samouczekprogramisty.basics.enums;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Human human1 = new Human("Szymon", 25, EyesColor.BROWN, HairColor.BLACK);
        System.out.println(human1.getEyesColor());
        System.out.println(human1.getHairColor());

        System.out.println(Arrays.toString(HairColor.values()));
    }
}
