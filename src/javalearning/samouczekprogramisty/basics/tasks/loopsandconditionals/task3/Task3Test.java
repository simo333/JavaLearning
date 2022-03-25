package javalearning.samouczekprogramisty.basics.tasks.loopsandconditionals.task3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Task3Test {
    private Task3 arrayFactory;
    private final int size = 5;


    @Test
    void whenCorrect_returnOneDimensionArray() {
        arrayFactory = new Task3(size);

        assertArrayEquals(new int[size], arrayFactory.oneDimension());
    }

    @Test
    void whenCorrect_returnTwoDimensionArray() {
        arrayFactory = new Task3(size);

        assertArrayEquals(new int[size][size], arrayFactory.twoDimensions());
    }

    @Test
    void whenIncorrectSize_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Task3(-5).oneDimension());
    }
}
