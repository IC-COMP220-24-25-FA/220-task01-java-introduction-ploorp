package edu.ithaca.dragon.shapes;

import java.util.Scanner;
import java.util.Random;

public class ShapeMain {
    
    public static void main(String[] args){
        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times

        Random rand = new Random();

        Rectangle r1 = new Rectangle(rand.nextDouble(19)+1, rand.nextDouble(19)+1);
        Rectangle r2 = new Rectangle(rand.nextDouble(19)+1, rand.nextDouble(19)+1);
        Rectangle r3 = new Rectangle(rand.nextDouble(19)+1, rand.nextDouble(19)+1);
        Rectangle r4 = new Rectangle(rand.nextDouble(19)+1, rand.nextDouble(19)+1);
        Rectangle r5 = new Rectangle(rand.nextDouble(19)+1, rand.nextDouble(19)+1);

        Rectangle[] rectangles = {r1,r2,r3,r4,r5};

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println("rectangle sizes:");

            for (int j = 0; j < 5; j++){
                System.out.printf("#%d area: %.2f longest line: %.2f%n", (j+1), rectangles[j].calcArea(), rectangles[j].longestLineWithin());
            }
            
            System.out.print("choose one to double: ");

            int userChoice = input.nextInt();

            rectangles[userChoice-1].doubleSize();
            System.out.println("\nrectangle #" + userChoice + " doubled\n");
        }
    }
}
