package javalearning.samouczekprogramisty.basics.unittests.intro;

import org.junit.Test;
import static org.junit.Assert.*;


public class ItemTest {
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenIncorrectParams() {
        new Item("Book", -5);
    }


    @Test
    public void shouldCreateCorrectItem() {
        Item item = new Item("Book", 10);

        assertTrue(item.getName().equals("Book") && item.getPrice() == 10);
    }
}