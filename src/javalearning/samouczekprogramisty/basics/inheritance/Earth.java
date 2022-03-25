package javalearning.samouczekprogramisty.basics.inheritance;

public class Earth {
    public static void main(String[] args) {
        Animal animal = new Human();
        System.out.println(animal);
        Mammal mammal = new Human();
        System.out.println(mammal);
        Human human = new Human();
        System.out.println(human);

        Animal animal1 = new Goldfish();
        System.out.println(animal1);
        Fish fish = new Goldfish();
        System.out.println(fish);
        Goldfish goldfish = new Goldfish();
        System.out.println(goldfish);

        Fish fish1 = new Fish() {
            @Override
            public String toString() {
                return "I am FISHHHHHHH.";
            }
        };

        System.out.println(fish1);

        Wild wild = new Wild() {
            @Override
            public String getDescription() {
                return "I am wilddd.";
            }
        };
        System.out.println(wild.getDescription());

        Wild wild2 = () -> "I am wild.";
        System.out.println(wild2.getDescription());
    }
}
