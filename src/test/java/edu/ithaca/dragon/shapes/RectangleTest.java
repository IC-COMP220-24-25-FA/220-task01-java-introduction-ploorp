package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(1, 1);
        assertEquals(1, myRectangle.calcArea());
        
        myRectangle = new Rectangle(5.5, 5);
        assertEquals(27.5, myRectangle.calcArea());

        myRectangle = new Rectangle(0.001, 5);
        assertEquals(0.005, myRectangle.calcArea());
    }

    @Test
    public void doubleSizeTest(){
        Rectangle myRectangle = new Rectangle(1, 1);
        double area = myRectangle.calcArea();
        myRectangle.doubleSize();
        assertEquals(area * 2, myRectangle.calcArea());

        myRectangle = new Rectangle(5.5, 5);
        area = myRectangle.calcArea();
        myRectangle.doubleSize();
        assertEquals(area * 2, myRectangle.calcArea());
    
        myRectangle = new Rectangle(0.001, 5);
        area = myRectangle.calcArea();
        myRectangle.doubleSize();
        assertEquals(area * 2, myRectangle.calcArea());
    }

    @Test
    public void longestLineWithinTest(){
        Rectangle myRectangle = new Rectangle(1, 1);
        assertEquals(1.4142, myRectangle.longestLineWithin());

        myRectangle = new Rectangle(5.5, 5);
        assertEquals(7.433, myRectangle.longestLineWithin());

        myRectangle = new Rectangle(0.001, 5);
        assertEquals(5, myRectangle.longestLineWithin());
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 0));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 1));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 1));
    }

}
