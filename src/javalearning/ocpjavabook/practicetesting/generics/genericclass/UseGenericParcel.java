package javalearning.ocpjavabook.practicetesting.generics.genericclass;

public class UseGenericParcel {
    public static void main(String[] args) {
        Parcel<Book> parcel = new Parcel<>();
        parcel.set(new Book());
        Book myBook = parcel.get();
        System.out.println(myBook.title);


        GenericBookParcel<String> genericBookParcel = new GenericBookParcel<>("Generic Class");
        System.out.println(genericBookParcel.getTestVar());

        NonGenericParcel nonGenericParcel = new NonGenericParcel();
        nonGenericParcel.set(new Book());
        System.out.println(nonGenericParcel.get());

    }
}
