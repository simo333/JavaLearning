package javalearning.ocpjavabook.practicetesting.intefaces;

public interface Movable {
    int speed = 10;
    static void move(){
        System.out.println("Moving static");
    }
    void moveInst();
}
