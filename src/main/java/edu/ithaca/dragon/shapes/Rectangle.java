package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;
    
    /**
     * @throws IllegalArgumentException if length or width is not a positive number
     */
    public Rectangle(double length, double width){
        if (length <= 0 || width <= 0) {throw new IllegalArgumentException();}
        this.length = length;
        this.width = width;
    }

    /**
     * @return the area of this rectangle
     */
    public double calcArea(){
       throw new RuntimeException("Not implemented yet");
    }

    /**
     * @post doubles the size of this rectangle
     */
    public void doubleSize(){
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * @return the longest straight line that can be drawn within this rectangle
     */
    public double longestLineWithin(){
        throw new RuntimeException("Not implemented yet");
    }
    
}
