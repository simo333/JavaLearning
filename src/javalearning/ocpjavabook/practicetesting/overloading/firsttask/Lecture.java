package javalearning.ocpjavabook.practicetesting.overloading.firsttask;

public class Lecture {
    void takeNotes(Paper paper) {
        System.out.println(paper.toString());
    }
    void takeNotes(Smartphone smartphone) {
        System.out.println(smartphone.toString());
    }
    void takeNotes(Laptop laptop) {
        System.out.println(laptop.toString());
    }


    public static void main(String args[]){
        Paper paper = new Paper();
        Smartphone smartphone = new Smartphone();
        Laptop laptop = new Laptop();
        Canvas canvas = new Canvas();

        Lecture lecture = new Lecture();
        FineArtLecture fal = new FineArtLecture();

        lecture.takeNotes(paper);
        lecture.takeNotes(smartphone);
        lecture.takeNotes(laptop);

        fal.takeNotes(paper);
        fal.takeNotes(smartphone);
        fal.takeNotes(laptop);
        fal.takeNotes(canvas);



    }

}
