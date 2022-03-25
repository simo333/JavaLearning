package javalearning.samouczekprogramisty.basics.unittests.junit5.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class SchoolDiaryTest {
    private SchoolDiary diary;
    private String maths, it, physics, chemistry;

    @BeforeEach
    void setUp() {
        diary = new SchoolDiary();
        maths = "maths";
        it = "it";
        physics = "physics";
        chemistry = "chemistry";
    }
//TESTING GETTING SUBJECTS FROM DIARY
    @Test
    void whenGetWholeSubjectList_thenReturnTheList() {
        diary.addSubject(maths);

        assertAll(
                () -> assertEquals(1, diary.getSubjectList().size()),
                () -> assertTrue(diary.getSubjectList().containsKey(maths)),
                () -> assertEquals(diary.getSubjectList().get(maths), new Subject("maths"))
        );
    }

    @Test
    void whenGetOneSubjectCorrectly_thenReturnIt() {
        diary.addSubject(maths);

        assertEquals(new Subject(maths), diary.getSubject(maths));
    }

    @Test
    void whenGetNotExisting_thenThrowIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> diary.getSubject("None"));

        String expectedMessage = "No such subject in the diary found.";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

//TESTING ADDING SUBJECTS TO THE DIARY
    @Test
    void whenAddSubjectCorrectly_ThenInDiary() {
        diary.addSubject(maths);

        assertTrue(diary.getSubjectList().containsKey(maths));
    }

    @Test
    void whenAddExistingSubject_thenThrowIllegalArgumentException() {
        diary.addSubject(maths);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> diary.addSubject(maths));

        String expectedMessage = "The diary already contains this subject.";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

//TESTING REMOVING SUBJECTS FROM THE DIARY
    @Test
    void whenRemoveSubjectCorrectly_thenNoInTheDiary() {
        diary.addSubject(maths);
        diary.addSubject(it);

        diary.removeSubject(maths);

        assertAll(
                () -> assertEquals(1, diary.getSubjectList().size()),
                () -> assertFalse(diary.getSubjectList().containsKey(maths))
        );
    }

    @Test
    void whenRemoveNotExisting_thenThrowIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> diary.removeSubject(maths));

        String expectedMessage = "No such subject in the diary found.";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void whenCorrectly_thenReturnAverageOfAllSubjects() {
        diary.addSubject(physics); diary.addSubject(chemistry);
        diary.getSubject(physics).addGrade(2.0);
        diary.getSubject(physics).addGrade(4.0);
        diary.getSubject(chemistry).addGrade(6.0);
        diary.getSubject(chemistry).addGrade(4.0);

        assertEquals(4.0, diary.getTotalAverage());
    }

    @Test
    void whenGettingTotalAverageFromEmptySubjectList_thenThrowNoSuchElementException() {
        assertThrows(NoSuchElementException.class, () -> diary.getTotalAverage());
    }

    @Test
    void whenGettingTotalAverageFromEmptySubjectGradesList_thenThrow() {
        diary.addSubject(maths);

        assertThrows(EmptyStackException.class, () -> diary.getTotalAverage());
    }
}