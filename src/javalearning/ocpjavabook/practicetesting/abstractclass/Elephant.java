package javalearning.ocpjavabook.practicetesting.abstractclass;

public class Elephant extends Animal {
    private String color;

    public Elephant(String food, double avgLife, String color) {
        super(food, avgLife);
        this.color = color;
    }


    @Override
    void eat() {
        System.out.println("Elephant eats " + getFood());
    }

    @Override
    void description() {
        System.out.println("This elephant has " + color + " color.");
    }
}
