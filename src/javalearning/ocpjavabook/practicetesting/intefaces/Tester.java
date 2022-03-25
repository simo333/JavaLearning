package javalearning.ocpjavabook.practicetesting.intefaces;

public class Tester implements Movable, Speakable, Runnable{
    private int instVar = 2;

    @Override
    public void moveInst() {
        Movable.move();
        System.out.println("Moving inst");
    }

    @Override
    public void moveInst(int abc) {
        this.instVar = abc;
        System.out.println("Runnable method");
    }

    public static void main(String[] args) {
        Tester test = new Tester();
        test.moveInst();
        Movable.move();
        Movable movable = new Tester();
        movable.moveInst();
        ((Speakable)movable).testSpeakable();

        System.out.println("////////////////////////////////////////");

        AbstractTester absTest = new AbstractSubclass();
        absTest.testSpeakable();
        absTest.moveInst();

        System.out.println("/////////////////////////////////////////");
        test.moveInst(test.instVar);

    }

    @Override
    public void testSpeakable() {
        System.out.println("Speakable method");
    }
}

