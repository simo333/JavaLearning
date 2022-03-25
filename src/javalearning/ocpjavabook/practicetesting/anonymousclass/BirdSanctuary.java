package javalearning.ocpjavabook.practicetesting.anonymousclass;

public class BirdSanctuary {
    Flyable bird = new Flyable() {
        @Override
        public void fly() {
            System.out.println("Flying high in the sky");
        }


    };
}
