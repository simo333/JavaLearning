package javalearning.samouczekprogramisty.basics.unittests.intro;

public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        if(price <= 0)
            throw new IllegalArgumentException("No item can cost 0 or less.");
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
