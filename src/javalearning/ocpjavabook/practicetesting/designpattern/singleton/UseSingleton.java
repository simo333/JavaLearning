package javalearning.ocpjavabook.practicetesting.designpattern.singleton;

public class UseSingleton {

    public static void main(String[] args) {
        SingletonType1 singleton1 = SingletonType1.getInstance();
        SingletonType1 singleton2 = SingletonType1.getInstance();
        System.out.println(singleton1 == singleton2);

        SingletonEagerInit singletonEager1 = SingletonEagerInit.getInstance();
        SingletonEagerInit singletonEager2 = SingletonEagerInit.getInstance();
        System.out.println(singletonEager1 == singletonEager2);

        SingletonSynchronized singletonSynchronized1 = SingletonSynchronized.getInstance();
        SingletonSynchronized singletonSynchronized2 = SingletonSynchronized.getInstance();
        System.out.println(singletonSynchronized1 == singletonSynchronized2);

        System.out.println(SingletonByEnum.INSTANCE.toString());
        System.out.println(SingletonByEnum.INSTANCE == SingletonByEnum.INSTANCE);
    }
}
