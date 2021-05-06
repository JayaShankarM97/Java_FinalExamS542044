/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColorableInterface_Pb2;

/**
 *
 * @author JayaShankar Mangina
 */
public class Square extends GeometricObject implements Colorable{
    private double squareSide;

    public Square(double squareSide) {
        this.squareSide = squareSide;
    }

    public double getSquareSide() {
        return squareSide;
    }

    public void setSquareSide(double squareSide) {
        this.squareSide = squareSide;
    }
    
    @Override
    public double AreaOfTheSquare(){
        return Math.pow(squareSide, 2.0);
    }

    @Override
    public String toString() {
        return "Square{" + "squareSide=" + squareSide + '}';
    }

    @Override
    public void howToColor() {
        if(squareSide!=0){
            System.out.println("Make Colors on all the four sides of the Square");    
        }else{
            System.out.println("The Side of the square is 0.0");
        }
    }
    
}

