package javalearning.samouczekprogramisty.basics.enums;

public enum EyesColor {
    BROWN, BLUE , GREEN;

    @Override
    public String toString() {
        return "The human has " + name().toLowerCase() + " eyes";
    }
}
