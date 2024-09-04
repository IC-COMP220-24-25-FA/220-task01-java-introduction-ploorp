package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        //first three tests are trying different positions for the largest number
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        //testing what happens if all same number
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));

        //ensuring error on negative 
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(100, FunctionPractice.calcSalePrice(100, 0, 0),0.01);
        assertEquals(160, FunctionPractice.calcSalePrice(200, 20, 0),0.01);
        assertEquals(110, FunctionPractice.calcSalePrice(100, 0, 10),0.01);
        assertEquals(94.5, FunctionPractice.calcSalePrice(100, 10, 5),0.01);
        assertEquals(0, FunctionPractice.calcSalePrice(100, 100, 10),0.01);
    }
    
}
