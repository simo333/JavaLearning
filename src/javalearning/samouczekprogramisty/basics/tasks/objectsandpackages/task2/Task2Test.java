package javalearning.samouczekprogramisty.basics.tasks.objectsandpackages.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    private Task2 rectangle;
    private double length, width, otherLength, otherWidth, incorrectLength, incorrectWidth;

    @BeforeEach
    void setUp() {
        length = 3;
        width = 2;
        otherLength = 5;
        otherWidth = 4;
        rectangle = new Task2(length, width);
    }

    @Test
    void setLength() {
        rectangle.setLength(otherLength);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> rectangle.setLength(incorrectLength));

        String expectedMessage = "Negative or zero values are forbidden.";
        String actualMessage = exception.getMessage();

        assertAll(
                () -> assertEquals(otherLength, rectangle.getLength()),
                () -> assertEquals(expectedMessage, actualMessage)
        );
    }

    @Test
    void setWidth() {
        rectangle.setWidth(otherWidth);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> rectangle.setWidth(incorrectWidth));

        String expectedMessage = "Negative or zero values are forbidden.";
        String actualMessage = exception.getMessage();

        assertAll(
                () -> assertEquals(otherWidth, rectangle.getWidth()),
                () -> assertEquals(expectedMessage, actualMessage)
        );
    }

    @Test
    void getArea() {
        assertEquals(6.0, rectangle.getArea());
    }

    @Test
    void getCircumference() {
        assertEquals(10.0, rectangle.getPerimeter());
    }

    @Test
    void getDiagonal() {
        assertEquals(3.61, BigDecimal.valueOf(rectangle.getDiagonal())
                                                .setScale(2, RoundingMode.HALF_UP).doubleValue());
    }
}