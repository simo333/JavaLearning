package javalearning.samouczekprogramisty.basics.tasks.objectsandpackages.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    private Human human;
    private Human other;

    @BeforeEach
    void setUp() {
        human = new Human("Szymon", 25, 85, 175, Human.Sex.MALE);
        other = new Human("Julia", 21, 50, 162, Human.Sex.FEMALE);
    }

    @Test
    void whenMale_thenTrue() {
        assertTrue(human.isMale());
    }

    @Test
    void whenFemale_thenFalse() {
        assertFalse(other.isMale());
    }

}