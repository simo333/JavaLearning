package javalearning.samouczekprogramisty.intermediate.innerclasses;

public class Task1 {
    interface GreetingModule {
        void sayHello();
    }

    public static class Robot {

        private final GreetingModule greetingModule;

        public Robot(GreetingModule greetingModule) {
            this.greetingModule = greetingModule;
        }
        private void saySomething() {
            greetingModule.sayHello();
        }

    }

    public static void main(String[] args) {
        Robot szymon = new Robot(new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("Witam!");
            }
        });

        Robot simo = new Robot(() -> System.out.println("Hello!"));

        Robot simone = new Robot(() -> System.out.println("Hallo!"));

        szymon.saySomething();
        simo.saySomething();
        simone.saySomething();
    }

}

