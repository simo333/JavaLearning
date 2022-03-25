package javalearning.samouczekprogramisty.basics.unittests.intro;

public class Store {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.getCartView();
        Item book = new Item("Book", 20);
        Item pencil = new Item("Pencil", 5);

        cart.addToCart(book, 3);
        cart.addToCart(pencil, 10);

        cart.getCartView();

        cart.deleteFromCart(pencil, 3);

        cart.getCartView();

        cart.deleteFromCart(book);

        cart.getCartView();
        System.out.println(cart.getCartValue());
    }
}
