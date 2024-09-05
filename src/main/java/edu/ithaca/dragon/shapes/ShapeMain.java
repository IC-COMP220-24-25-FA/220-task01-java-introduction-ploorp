package edu.ithaca.dragon.shapes;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class ShapeMain {
    
    public static void generateShapes(){
        ArrayList<Shape> shapes = new ArrayList<>();
        Random rand = new Random();
        Shape shape = null;

        System.out.println("generated shapes\n");

        for (int i=0; i<10; i++){
            int x = rand.nextInt(1,4);
            switch (x){
                case 1:{
                    shape = new Circle(5);
                    break;
                }
                case 2:{
                    shape = new Rectangle(5, 5);
                    break;
                }
                case 3:{
                    shape = new Triangle(new double[] {6, 5, 10});
                    break;
                }
            }
            System.out.println(shape.toString());
            shapes.add(shape);
        }

        System.out.println("\ndoubled sizes below\n");

        for (Shape s : shapes) {
            s.doubleSize();
            System.out.println( s.toString());
        }
    }

    public static void main(String[] args){
        generateShapes();

        //Make a list of 5 randomly-sized rectangles and print their area and the largest line that can be drawn through them
        //Allow the user to choose one, double the size of that one, and print them all again
        //Use a loop to repeat the process 5 times

        Random rand = new Random();

        Rectangle[] rectangles = new Rectangle[5];

        for (int i = 0; i < 5; i++){
            rectangles[i] = new Rectangle(rand.nextDouble(19)+1, rand.nextDouble(19)+1);
        }

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

        System.out.println("final rectangle sizes:");

        for (int j = 0; j < 5; j++){
            System.out.printf("#%d area: %.2f longest line: %.2f%n", (j+1), rectangles[j].calcArea(), rectangles[j].longestLineWithin());
        }

        input.close();
    }
}
