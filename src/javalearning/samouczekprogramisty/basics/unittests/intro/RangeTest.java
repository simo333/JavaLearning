package javalearning.samouczekprogramisty.basics.unittests.intro;

import org.junit.*;

public class RangeTest {
    private Range range;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("After class");
    }

    @Before
    public void setUp() {
        range = new Range(10, 20);
    }

    @After
    public void tearDown() {
        System.out.println(range);
    }

    @Test
    public void shouldSayThat15IsInRange() {
        Assert.assertTrue(range.isInRange(15));
    }
    @Test
    public void shouldSayThat21IsNotInRange() {
        Assert.assertFalse(range.isInRange(21));
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrownIllegalArgumentExceptionOnWrongParameters() {
        new Range(20,10);
    }
}
