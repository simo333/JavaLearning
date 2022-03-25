package javalearning.samouczekprogramisty.basics.unittests.junit5.task1;

import java.util.EmptyStackException;
import java.util.Objects;
import java.util.Stack;

public class Subject {
    private final String name;
    private final Stack<Double> grades = new Stack<>();

    public Subject(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public Stack<Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) throws IllegalArgumentException{
        if (grade <= 6 && grade >= 1) {
            if (grade % 1.0 == 0.0 || grade % 1.0 == 0.5)
                grades.push(grade);
            else throw new IllegalArgumentException("You can add a grade with decimal of 0 or 5, e.g.: 1.0, 3.5.");
        } else throw new IllegalArgumentException("You can add a grade in range of 1-6.");
    }

    public void removeGrade(Double toDelete) {
        if(!grades.contains(toDelete))
            throw new IllegalArgumentException("No such grade in the list.");
        grades.remove(toDelete);
    }

    public void removeLastGrade() {
        if(grades.peek() == null)
            throw new EmptyStackException();
        grades.pop();
    }

    public void removeAllGrades() {
        grades.clear();
    }

    public void editLastGrade(Double newGrade) {
        removeGrade(grades.peek());
        addGrade(newGrade);
    }

    public Double getAverageGrade() {
        if(grades.isEmpty())
            throw new EmptyStackException();
        return grades.stream().mapToDouble(Double::doubleValue).average().orElseThrow();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return name.equalsIgnoreCase(subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
