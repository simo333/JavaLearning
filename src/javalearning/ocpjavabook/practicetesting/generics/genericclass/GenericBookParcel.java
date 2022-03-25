package javalearning.ocpjavabook.practicetesting.generics.genericclass;

public class GenericBookParcel <T> extends Parcel <T>{
    private T test;

    public GenericBookParcel(T test) {
        this.test = test;
    }

    public T getTestVar() {
        return test;
    }

}
