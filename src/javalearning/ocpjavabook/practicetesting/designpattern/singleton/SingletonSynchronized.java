package javalearning.ocpjavabook.practicetesting.designpattern.singleton;

public class SingletonSynchronized {
    private static SingletonSynchronized anInstance;


    //full synchronized method
    synchronized public static SingletonSynchronized getInstance() {
        if (anInstance == null)
            anInstance = new SingletonSynchronized();
        return anInstance;
    }

    //partial synchronized method
//    public static SingletonSynchronized getInstance() {
//        if (anInstance == null)
//            synchronized (SingletonSynchronized.class) {
//                if (anInstance == null)
//                    anInstance = new SingletonSynchronized();
//                }
//        return anInstance;
//    }
//

        private SingletonSynchronized() {
            System.out.println("Constructor synchronized type");
        }
}

