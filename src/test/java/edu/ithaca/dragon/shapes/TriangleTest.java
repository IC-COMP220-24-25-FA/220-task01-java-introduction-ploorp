package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void calcAreaTest(){
        Triangle myTriangle = new Triangle(new double[] {1,1,1});
        assertEquals(0.433, myTriangle.calcArea(), 0.001);
        
        myTriangle = new Triangle(new double[] {12,10,10});
        assertEquals(48, myTriangle.calcArea());

        myTriangle = new Triangle(new double[] {2,10,9});
        assertEquals(8.1815, myTriangle.calcArea(), 0.001);
    }

    @Test
    public void doubleSizeTest(){
        Triangle myTriangle = new Triangle(new double[] {1,1,1});
        double area = myTriangle.calcArea();
        myTriangle.doubleSize();
        assertEquals(area * 2, myTriangle.calcArea(), 0.00000001);

        myTriangle = new Triangle(new double[] {12,10,10});
        area = myTriangle.calcArea();
        myTriangle.doubleSize();
        assertEquals(area * 2, myTriangle.calcArea(), 0.00000001);
    
        myTriangle = new Triangle(new double[] {2,10,9});
        area = myTriangle.calcArea();
        myTriangle.doubleSize();
        assertEquals(area * 2, myTriangle.calcArea(), 0.00000001);
    }

    @Test
    public void longestLineWithinTest(){
        Triangle myTriangle = new Triangle(new double[] {1,1,1});
        assertEquals(1, myTriangle.longestLineWithin());

        myTriangle = new Triangle(new double[] {12,10,10});
        assertEquals(12, myTriangle.longestLineWithin());

        myTriangle = new Triangle(new double[] {2,10,9});
        assertEquals(10, myTriangle.longestLineWithin());
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Triangle(new double[] {0,1,1}));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(new double[] {0,0,0}));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(new double[] {-1,1,1}));

        assertThrows(IllegalArgumentException.class, () -> new Triangle(new double[] {1,1,10}));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(new double[] {2,5,1}));
    }

}
