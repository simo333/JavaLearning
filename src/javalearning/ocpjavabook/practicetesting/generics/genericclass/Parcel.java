package javalearning.ocpjavabook.practicetesting.generics.genericclass;

public class Parcel <T> {
    private T t;

    public void set (T t){
        this.t = t;
    }

    public T get() {
        return t;
    }
}
