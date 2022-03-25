package javalearning.ocpjavabook.practicetesting.abstractclass;

public abstract class Human extends Animal{

    Human(){
        super("all", 70);
    }
    @Override
    void eat() {

    }

    @Override
    abstract void description();
}
