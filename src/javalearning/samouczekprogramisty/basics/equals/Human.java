package javalearning.samouczekprogramisty.basics.equals;

import java.util.Objects;

public class Human {
    private String name;
    private String lastName;
    private final int yearOfBirth;
    private final int pesel;

    public Human(String name, String lastName, int yearOfBirth, int pesel) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return pesel == human.pesel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }
}
