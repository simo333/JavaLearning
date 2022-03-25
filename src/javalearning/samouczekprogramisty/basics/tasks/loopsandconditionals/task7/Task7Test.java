package javalearning.samouczekprogramisty.basics.tasks.loopsandconditionals.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void isPalindrome() {
        assertAll(
                () -> assertTrue(Task7.isPalindrome("kajak")),
                () -> assertTrue(Task7.isPalindrome("baab")),
                () -> assertFalse(Task7.isPalindrome("kuku"))
        );
    }
}