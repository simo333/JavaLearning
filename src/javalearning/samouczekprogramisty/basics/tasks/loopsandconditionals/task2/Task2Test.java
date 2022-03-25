package javalearning.samouczekprogramisty.basics.tasks.loopsandconditionals.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    void showNumbers() {
        assertDoesNotThrow(() -> new Task2().showNumbers(10));
    }
}