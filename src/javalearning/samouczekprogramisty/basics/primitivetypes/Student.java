package javalearning.samouczekprogramisty.basics.primitivetypes;

public class Student {
    private String name;
    private Subject[] subjects;

    public Student(String name, Subject[] subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public Subject getSubject(int index){
        return subjects[index];
    }

    public void setSubject(int index, Subject subject){
        subjects[index] = subject;
    }
}
