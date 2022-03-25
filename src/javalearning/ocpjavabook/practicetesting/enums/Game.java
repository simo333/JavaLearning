package javalearning.ocpjavabook.practicetesting.enums;

public class Game {
    static DifficultyLevel level;
    enum Test {B, A, C}

    Game(DifficultyLevel level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Game level = " + level;
    }

    public static void main(String[] args){
        Game newGame = new Game(DifficultyLevel.EASY);
        System.out.println(newGame.toString());
        Monster dragon = new Monster(level, "Keogruteras", 20000, 300.25);
        System.out.println(dragon);
        Monster dragon2 = new Monster(DifficultyLevel.MEDIUM, "Keo", 20000, 300.25);
        System.out.println(dragon2);
        Monster dragon3 = new Monster(DifficultyLevel.HARD, "Zor'Varuk", 20000, 300.25);
        System.out.println(dragon3);


    }
}
