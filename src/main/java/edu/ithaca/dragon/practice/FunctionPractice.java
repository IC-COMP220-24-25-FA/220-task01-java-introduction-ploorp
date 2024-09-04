package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){
        if (first < 0 || second < 0 || third < 0){
            throw new IllegalArgumentException("numbers must be positive");
        }
        
        if (first >= second && first >= third){
            return first;
        }
        else if (second >= third){
            return second;
        }
        else {
            return third;
        }
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        double discountPrice = originalPrice * (1 - discountPercent / 100);
        double taxAmount = discountPrice * (salesTax / 100);
        return discountPrice + taxAmount;
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){
        if (fetchedThePaperToday == true && daysSinceShoesChewed > 0 && yearsOld > 1){
            return true;
        }
        return false;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        if (numbers.isEmpty()){return -1;}

        int max = numbers.get(0);
        int maxI = 0;
        int i = 0;

        for (int item : numbers){
            if (item > max){
                max = numbers.get(i);
                maxI = i;
            }
            i++;
        }
        return maxI;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        if (numbers.isEmpty()){return -1;}

        int max = numbers.get(0);
        int maxI = 0;
        int i = 0;

        for (int item : numbers){
            if (item >= max){
                max = numbers.get(i);
                maxI = i;
            }
            i++;
        }
        return maxI;
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        throw new RuntimeException("Not Implemented");
    }


}
