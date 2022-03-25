package javalearning.samouczekprogramisty.basics.unittests.intro;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartTest {
    private Cart cart = new Cart();
    private Item book, pencil, shoes, knife;

    @BeforeEach
    void setUp() {
        book = new Item("Book", 30);
        pencil = new Item("Pencil", 5);
        shoes = new Item("Shoes", 100);
        knife = new Item("Knife", 32);
    }

    @Test
    public void cartShouldHaveOneItem(){
        cart.addToCart(book, 5);

        assertEquals(cart.getCartMap().size(), 1);
    }

    @Test
    public void shouldContainShoesInCart() {
        cart.addToCart(shoes, 5);
        cart.addToCart(pencil, 10);
        cart.addToCart(knife, 3);

        assertTrue(cart.getCartMap().containsKey(shoes));
    }

    @Test
    public void shouldRemoveShoesFromCart() {
        cart.addToCart(shoes, 5);
        cart.addToCart(pencil, 10);
        cart.addToCart(knife, 3);

        cart.deleteFromCart(shoes);

        assertFalse(cart.getCartMap().containsKey(shoes));
    }

    @Test
    public void shouldReturnCorrectValue() {
        cart.addToCart(book, 2);
        cart.addToCart(pencil, 2);
        cart.addToCart(shoes, 2);
        cart.addToCart(knife, 2);

        assertEquals(cart.getCartValue(), 334.0);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenRemoveMoreThanInCart() {
        cart.addToCart(knife,2);

        assertThrows(IllegalArgumentException.class, () -> cart.deleteFromCart(knife,3));
    }

    @Test
    public void shouldThrowIllegalArgumentException_whenNegativeAmountAdded() {
        assertThrows(IllegalArgumentException.class, () -> cart.addToCart(book, -3));
    }
}