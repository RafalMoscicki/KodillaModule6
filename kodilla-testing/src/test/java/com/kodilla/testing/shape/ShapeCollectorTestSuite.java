package com.kodilla.testing.shape;

import com.kodilla.testing.Shapes.*;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    private ShapeCollector testee = new ShapeCollector();


    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        // given when
        testee.addFigure(new Circle(1.00));

        // then
        Assert.assertTrue(testee.getListOfShapes().contains(new Circle(1.00)));
    }

    @Test
    public void testRemoveFigure() {
        // given
        testee.addFigure(new Circle(1.00));
        testee.addFigure(new Square(2.00));

        // when
        testee.removeFigure(new Square(2.00));

        // then
        Assert.assertEquals(1, testee.getListOfShapes().size());
        Assert.assertTrue(testee.getListOfShapes().contains(new Circle(1.00)));
        Assert.assertFalse(testee.getListOfShapes().contains(new Square(2.00)));
    }

    @Test
    public void testGetFigure() {
        // given
        testee.addFigure(new Circle(1.00));
        testee.addFigure(new Square(2.00));
        Shape expected = new Circle(1.00);

        // when
        Shape result = testee.getFigure(0);

        // then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testShowFigures() {
        // given
        testee.addFigure(new Circle(1.00));
        testee.addFigure(new Square(2.00));
        testee.addFigure(new Triangle(2.0, 3.0));
        String expected = "Circle(1.0), Square(2.0), Triangle(2.0,3.0)";

        // when
        String result = testee.showFigures();

        // then
        Assert.assertEquals(expected, result);
    }
}
