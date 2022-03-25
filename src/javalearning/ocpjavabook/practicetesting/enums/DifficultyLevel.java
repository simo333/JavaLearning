package javalearning.ocpjavabook.practicetesting.enums;

public enum DifficultyLevel {
    EASY(0.4),
    MEDIUM(0.7),
    HARD(1.0);

    private final double difficultyConverter;

    DifficultyLevel(double difficultyConverter){
        this.difficultyConverter = difficultyConverter;
    }

    public Double getDifficultyConverter() {
        return difficultyConverter;
    }

}
