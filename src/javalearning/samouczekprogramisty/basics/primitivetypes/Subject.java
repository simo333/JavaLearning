package javalearning.samouczekprogramisty.basics.primitivetypes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Subject {
    private String name;
    private double[] grades = new double[20];

    public Subject(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public Subject(String name) {
        this.name = name;
        this.grades = Arrays.stream(grades)
                            .map(e -> e = 0)
                            .toArray();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double getGrade(int index){
        return grades[index];
    }

    public void setGrade(int index, double grade){
        grades[index] = grade;
    }

    public double gradesAverage(){
        return BigDecimal.valueOf(Arrays.stream(grades).average().orElse(0))
                .setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
