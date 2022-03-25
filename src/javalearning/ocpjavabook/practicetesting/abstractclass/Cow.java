package javalearning.ocpjavabook.practicetesting.abstractclass;

public class Cow extends Animal implements Breedable {
    private double weight;
    private String breedingType;

    public Cow(String food, double avgLife, double weight, String typeOfBreeding) {
        super(food, avgLife);
        this.weight = weight;
        this.breedingType = typeOfBreeding;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBreedingType() {
        return breedingType;
    }

    public void setBreedingType(String breedingType) {
        this.breedingType = breedingType;
    }

    @Override
    void eat() {
        System.out.println("This cow is fed with " + getFood());
    }

    @Override
    void description() {
        System.out.println("The cow is bred. The cow weighs " + getWeight() + "kg.");
    }

    @Override
    public void typeOfBreeding() {
        System.out.println("This cow is breeding " + getBreedingType());
    }
}
