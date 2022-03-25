package javalearning.ocpjavabook.practicetesting.abstractclass;

public abstract class Animal{
    private String food;
    private double avgLife;

    public Animal(String food, double avgLife) {
        this.food = food;
        this.avgLife = avgLife;
    }

    abstract void eat();
    abstract void description();

    void life(){
        System.out.println("It lives: " + avgLife);
    }

    public String getFood() {
        return food;
    }

    public double getAvgLife() {
        return avgLife;
    }
}
