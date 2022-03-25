package javalearning.ocpjavabook.practicetesting.generics.genericclass;

public class NonGenericParcel extends Parcel<Book> {
    private String nonGeneric;

    NonGenericParcel(){
        nonGeneric = "Non generic class";
    }

    public String getNonGeneric(){
        return nonGeneric;
    }
}
