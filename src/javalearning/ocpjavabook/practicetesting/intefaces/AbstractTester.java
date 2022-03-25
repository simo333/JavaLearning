package javalearning.ocpjavabook.practicetesting.intefaces;

public abstract class AbstractTester implements Movable, Speakable{


    @Override
    public void moveInst() {
        System.out.println("AbstractTester MovableInst");
    }
}
