package javalearning.ocpjavabook.practicetesting.generics.genericmethod.gm2;

public class Parcel <T>{
    public <X> void deliver(X x) {
        System.out.println(x.getClass());
    }

    public static void main(String[] args) {
        Parcel<String> parcel = new Parcel<>();
        Book book = new Book();
        parcel.deliver("Hello");


    }
}
