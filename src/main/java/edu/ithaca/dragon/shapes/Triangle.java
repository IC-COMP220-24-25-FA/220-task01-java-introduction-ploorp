package edu.ithaca.dragon.shapes;

public class Triangle {
    private double[] sides;

    public Triangle(double[] sidesIn){
        if (sidesIn[0] <= 0 || sidesIn[1] <= 0 || sidesIn[2] <= 0) {
            throw new IllegalArgumentException();
        }
        sides = sidesIn;
    }

    public double calcArea(){
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];

        double s = (a + b + c) / 2.0;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public void doubleSize(){
        double a = sides[0] * Math.sqrt(2);
        double b = sides[1] * Math.sqrt(2);
        double c = sides[2] * Math.sqrt(2);
        sides = new double[] {a,b,c};
    }

    public double longestLineWithin(){
        return Math.max(sides[0], Math.max(sides[1], sides[2]));
    }

}
