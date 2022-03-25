package javalearning.samouczekprogramisty.basics.primitivetypes;

public class Task1 {
    public static void main(String[] args) {
        Subject[] subjects = new Subject[4];
        subjects[0] = new Subject("Matematyka", new double[]{2,3,5,2,6,2,3,5,6,1,2,5});
        subjects[0] = new Subject("Informatyka", new double[]{3,3,4,1,4,5,1,4,6,5,4,5});
        subjects[0] = new Subject("W-F", new double[]{5,5,5,4,6,5,4,5,6,3,4,6});
        subjects[0] = new Subject("Wiedza o Społeczeństwie", new double[]{3,4,1,6,6,6,6,5,6,4,3,5});
        Student student = new Student("Szymon Poniedziałekl", subjects);

        System.out.println(student.getSubject(0).gradesAverage());

    }
}
