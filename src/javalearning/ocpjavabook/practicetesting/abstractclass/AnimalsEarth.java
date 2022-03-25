package javalearning.ocpjavabook.practicetesting.abstractclass;

import java.nio.channels.ClosedSelectorException;

public class AnimalsEarth {



    public static void main (String[] args) throws ClassCastException{
        Animal[] animals = new Animal[3];
        animals[0] = new Tiger(12, "Antilopes", true);
        animals[1] = new Elephant("Leaves", 15, "blue");
        animals[2] = new Cow("fodder", 3, 300, "ecologic");

        animals[2].description();
        animals[2].eat();
        animals[2].life();
        ((Breedable)animals[2]).typeOfBreeding();

        Animal lion = new Tiger(12, "Antilopes", false);
        lion.eat();
    }
}
