package javalearning.samouczekprogramisty.basics.tasks.loopsandconditionals.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void showNumbers() {
        assertDoesNotThrow(() -> new Task1().showNumbers(10));
    }
}