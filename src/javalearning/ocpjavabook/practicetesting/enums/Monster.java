package javalearning.ocpjavabook.practicetesting.enums;

import java.math.BigDecimal;

public class Monster {
    private final DifficultyLevel Level;
    private final String name;
    private int hp;
    private double damage;

    public Monster(DifficultyLevel level, String name, int hp, double damage) {
        this.Level = level;
        this.name = name;
        this.hp = (int)((hp * level.getDifficultyConverter()));
        this.damage = Math.round(damage * level.getDifficultyConverter() * 100.0) / 100.0;
    }


    public Monster() {
        this(DifficultyLevel.EASY, "None", 0, 0);
    }


    public DifficultyLevel getLevel() {
        return Level;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public double getDamage() {
        return damage;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                '}';
    }
}
