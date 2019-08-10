package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beggining of tests");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }
    @Before
    public void beforeEveryTest(){
        System.out.println("Preparing to execute test number " + testCounter);
    }
    @Test
    public void testAddFigure(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        Circle circle1 = new Circle("circle1", 12 );
        Triangle triangle1 = new Triangle("triagle1", 12, 15);
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(triangle1);

        //then
        Assert.assertEquals(2, shapeCollector.showFigures());
    }
    @Test
    public void testGetFigure(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle1 = new Circle("circle1", 12 );
        Triangle triangle1 = new Triangle("triagle1", 12, 15);
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(triangle1);

        //when
        Circle retrievedCircle;
        retrievedCircle = (Circle)shapeCollector.getFigure(0);

        //then
        Assert.assertEquals(circle1, retrievedCircle);
    }
    @Test
    public void testRemoveFigNotExisting(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle1 = new Circle("circle1", 12 );
        Triangle triangle1 = new Triangle("triagle1", 12, 15);
        Square square1 = new Square("square1", 12);
        //when
        boolean result = shapeCollector.removeFigure(circle1);

        //then
        Assert.assertFalse(result);
    }
    @Test
    public void testRemoveFigure(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle1 = new Circle("circle1", 12 );
        Triangle triangle1 = new Triangle("triagle1", 12, 15);
        Square square1 = new Square("square1", 12);
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(triangle1);
        shapeCollector.addFigure(square1);

        //when
        boolean result = shapeCollector.removeFigure(circle1);

        //then
        Assert.assertTrue(result);
        Assert.assertEquals(2, shapeCollector.showFigures());
    }
    @Test
    public void testshowFigures(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle1 = new Circle("circle1", 12 );
        Triangle triangle1 = new Triangle("triagle1", 12, 15);
        Square square1 = new Square("square1", 12);
        shapeCollector.addFigure(circle1);
        shapeCollector.addFigure(triangle1);
        shapeCollector.addFigure(square1);

        //when
        int result = shapeCollector.showFigures();

        //then
        Assert.assertEquals(3, result);
    }
}

