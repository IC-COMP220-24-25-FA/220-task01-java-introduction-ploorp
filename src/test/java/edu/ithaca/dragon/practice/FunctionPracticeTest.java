package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;

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

    @Test
    public void isGoodDogTest() {
        assertTrue(FunctionPractice.isGoodDog(2, 5, true));
        assertFalse(FunctionPractice.isGoodDog(0, 5, true));
        assertFalse(FunctionPractice.isGoodDog(2, 0, true));
        assertFalse(FunctionPractice.isGoodDog(2, 5, false));
        assertFalse(FunctionPractice.isGoodDog(1, 5, true));
    }
    
    @Test
    public void findFirstLargestTest() {
        assertEquals(2, FunctionPractice.findFirstLargest(Arrays.asList(1, 3, 7, 4, 7, 2)));
        assertEquals(0, FunctionPractice.findFirstLargest(Arrays.asList(10, 9, 8, 7)));
        assertEquals(3, FunctionPractice.findFirstLargest(Arrays.asList(1, 2, 3, 4, 4)));
        assertEquals(-1, FunctionPractice.findFirstLargest(Arrays.asList()));
        assertEquals(4, FunctionPractice.findFirstLargest(Arrays.asList(5, 4, 3, 2, 6, 5, 6)));
    }

    @Test
    public void findLastLargestTest() {
        assertEquals(4, FunctionPractice.findLastLargest(Arrays.asList(1, 3, 7, 4, 7, 2)));
        assertEquals(0, FunctionPractice.findLastLargest(Arrays.asList(10, 9, 8, 7)));
        assertEquals(4, FunctionPractice.findLastLargest(Arrays.asList(1, 2, 3, 4, 4)));
        assertEquals(-1, FunctionPractice.findLastLargest(Arrays.asList()));
        assertEquals(6, FunctionPractice.findLastLargest(Arrays.asList(5, 4, 3, 2, 6, 5, 6)));
    }

    @Test
    public void findFirstMostOccurencesOfLetterTest() {
        assertEquals("ababaa", FunctionPractice.findFirstMostOccurencesOfLetter(Arrays.asList("abc", "ababaa", "aaaa", "baba"), 'a'));
        assertEquals("tttt", FunctionPractice.findFirstMostOccurencesOfLetter(Arrays.asList("tt", "ttt", "tttt", "tt"), 't'));
        assertEquals("xxxyyy", FunctionPractice.findFirstMostOccurencesOfLetter(Arrays.asList("xy", "xxxyyy", "yyy", "x"), 'x'));
        assertEquals("", FunctionPractice.findFirstMostOccurencesOfLetter(Arrays.asList("asdf", "def", "ghi"), 'z'));
        assertEquals("aabbccdd", FunctionPractice.findFirstMostOccurencesOfLetter(Arrays.asList("abc", "abcd", "aabbccdd", "abcdabcd"), 'b'));
    }
}
