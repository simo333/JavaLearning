package javalearning.samouczekprogramisty.basics.unittests.junit5.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {
    private Subject subject;

    @BeforeEach
    void setUp(){
        subject = new Subject("subject");
    }

//TESTING ADDING GRADES TO THE SUBJECT
    @Test
    void whenAddGradeCorrectly_thenInGradesStack(){
        subject.addGrade(3);
        subject.addGrade(2.5);
        subject.addGrade(3);
        Stack<Double> stackTest = new Stack<>();
        stackTest.push(3.0);
        stackTest.push(2.5);
        stackTest.push(3.0);

        assertAll(
                () -> assertTrue(subject.getGrades().containsAll(stackTest)),
                () -> assertEquals(3, subject.getGrades().size())
        );
    }

    @Test
    void whenAddGradeOutOfRange_thenThrowIllegalArgumentException() {
        double lowerBound = 0.5;
        double upperBound = 6.5;

        Exception exceptionLowerBound = assertThrows(IllegalArgumentException.class, () -> subject.addGrade(lowerBound));
        Exception exceptionUpperBound = assertThrows(IllegalArgumentException.class, () -> subject.addGrade(upperBound));

        String expectedMessage = "You can add a grade in range of 1-6.";
        String actualMessageLB = exceptionLowerBound.getMessage();
        String actualMessageUB = exceptionUpperBound.getMessage();

        assertAll(
                () -> assertEquals(expectedMessage, actualMessageLB),
                () -> assertEquals(expectedMessage, actualMessageUB),
                () -> assertFalse(subject.getGrades().contains(lowerBound)
                        || subject.getGrades().contains(upperBound))
        );
    }

    @Test
    void whenAddGradeWithWrongDecimal_thenThrowIllegalArgumentException() {
        double wrongGrade = 3.2;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> subject.addGrade(wrongGrade));

        String expectedMessage = "You can add a grade with decimal of 0 or 5, e.g.: 1.0, 3.5.";
        String actualMessage = exception.getMessage();

        assertAll(
                () -> assertEquals(expectedMessage, actualMessage),
                () -> assertFalse(subject.getGrades().contains(wrongGrade))
        );
    }

//TESTING REMOVING GRADE FROM DIARY
    @Test
    void whenRemovedGradeCorrectly_thenNotInTheStack() {
        double toDelete = 3.0;
        subject.addGrade(toDelete);
        subject.removeGrade(toDelete);

        assertFalse(subject.getGrades().contains(toDelete));
    }

    @Test
    void whenRemoveNotExisting_thenThrowIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> subject.removeGrade(5.0));

        String expectedMessage = "No such grade in the list.";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void whenRemoveLastGrade_thenRemoveLastAdded() {
        double first = 2.0;
        double last = 3.0;

        subject.addGrade(first);
        subject.addGrade(last);

        subject.removeLastGrade();

        assertAll(
                () -> assertFalse(subject.getGrades().contains(last)),
                () -> assertTrue(subject.getGrades().contains(first))
        );
    }

    @Test
    void whenRemovedLastFromEmpty_thenThrowEmptyStackException() {
        assertThrows(EmptyStackException.class, () -> subject.removeLastGrade());
    }

    @Test
    void whenRemoveAllGrades_thenEmptyGradeStack() {
        subject.addGrade(3.0);
        subject.addGrade(2.0);
        subject.addGrade(1.5);

        subject.removeAllGrades();

        assertTrue(subject.getGrades().isEmpty());
    }

//TESTING EDITING GRADES
    @Test
    void whenEditCorrectly_thenIntroduceTheChange() {
        double newGrade = 3.0;
        subject.addGrade(2.0);
        subject.editLastGrade(newGrade);

        assertAll(
                () -> assertEquals(newGrade, subject.getGrades().peek()),
                () -> assertEquals(1, subject.getGrades().size())
        );
    }

    @Test
    void whenEditEmptyStack_thenThrowEmptyStackException() {
        assertThrows(EmptyStackException.class, () -> subject.editLastGrade(3.0));
    }

    @Test
    void whenEdit_newGradeOutOfRange_thenThrowIllegalArgumentException() {
        subject.addGrade(3.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> subject.editLastGrade(7.0));

        String expectedMessage = "You can add a grade in range of 1-6.";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void whenEdit_newGradeWithWrongDecimal_thenThrowIllegalArgumentException() {
        subject.addGrade(3.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> subject.editLastGrade(3.3));

        String expectedMessage = "You can add a grade with decimal of 0 or 5, e.g.: 1.0, 3.5.";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

//TESTING COMPUTING AVERAGE GRADE
    @Test
    void whenCorrectly_thenReturnAverage() {
        subject.addGrade(1.0); subject.addGrade(2.0); subject.addGrade(3.0);
        subject.addGrade(4.0); subject.addGrade(5.0);

        assertEquals(3.0, subject.getAverageGrade());
    }

    @Test
    void whenGetAverageFromEmptyStack_thenThrowEmptyStackException() {
        assertThrows(EmptyStackException.class, () -> subject.getAverageGrade());
    }
}