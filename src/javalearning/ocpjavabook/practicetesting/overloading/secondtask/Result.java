package javalearning.ocpjavabook.practicetesting.overloading.secondtask;

public class Result {
    double calcAverage(int marks1, int marks2) {
        return (marks1 + marks2) / 2;
    }
    double calcAverage(int marks1, int marks2, int marks3) {
        return (marks1 + marks2 + marks3) / 3;
    }
    double calcAverage(int marks1, double marks2) {
        return (marks1 + marks2) / 2;
    }
    double calcAverage(double marks1, double marks2) {
        return (marks1 + marks2) / 2;
    }
}
