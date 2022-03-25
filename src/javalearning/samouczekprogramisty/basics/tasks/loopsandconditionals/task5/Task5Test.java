package javalearning.samouczekprogramisty.basics.tasks.loopsandconditionals.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void reverseString() {
        assertEquals("cba", new Task5().reverseString("abc"));
    }
}