package javalearning.ocpjavabook.practicetesting.abstractclass;

public class Tiger extends Animal {
     final boolean striped;

    Tiger(double avgLife, String food, boolean striped) {
        super(food, avgLife);
        this.striped = striped;
    }


    @Override
    void eat() {
        System.out.println("Tiger eats " + getFood());
    }

    @Override
    void life() {
        System.out.println("Tiger lives: " + getAvgLife());
    }

    void description() {
        if(striped == true) System.out.println("This tiger is striped.");
        else System.out.println("This tiger is not striped.");
    }
}
