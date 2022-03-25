package javalearning.ocpjavabook.practicetesting.anonymousclass;

public class Student {
    static void attendLecture() {
        Lecture lecture = new Lecture();
        lecture.notes(new Pen() {
            public void write() {
                System.out.println("OK! I am writing!");
            }
        }
        );
    }

    public static void main (String[] args) {
        attendLecture();
    }
}
