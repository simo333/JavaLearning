package javalearning.samouczekprogramisty.basics.enums;

public enum HairColor {
    BROWN, BLOND, BLACK, RED, GRAY;

    @Override
    public String toString() {
        return "The human has " + name().toLowerCase() + " hair.";
    }
}
