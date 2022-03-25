package javalearning.ocpjavabook.practicetesting.generics.bounded;

public class Parcel <T extends Gift & Giftable>{
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public void shipParcel() {
        if (t.getWeight() > 10) System.out.println("Ship by courier ABC");
        else System.out.println("Ship by courier XYZ");
    }
}
