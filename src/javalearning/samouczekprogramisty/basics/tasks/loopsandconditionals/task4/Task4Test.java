package javalearning.samouczekprogramisty.basics.tasks.loopsandconditionals.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void printNumbersReversed() {
        assertDoesNotThrow(() -> new Task4().printNumbersReversed(1,2,3,4,5,6));
    }
}