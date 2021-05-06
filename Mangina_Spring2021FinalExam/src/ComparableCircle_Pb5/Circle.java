/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComparableCircle_Pb5;

/**
 *
 * @author JayaShankar Mangina
 */
public class Circle {
    private double radiusOfCircle;
    
    public Circle(){
        
    }

    public Circle(double radiusOfCircle) {
        this.radiusOfCircle = radiusOfCircle;
    }

    public double getRadiusOfCircle() {
        return radiusOfCircle;
    }

    public void setRadiusOfCircle(double radiusOfCircle) {
        this.radiusOfCircle = radiusOfCircle;
    }
    
    public double AreaOfCircle(){
        return Math.pow(radiusOfCircle, 2.0) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle Radius: " +radiusOfCircle+"\n"+"Area of Circle: " +AreaOfCircle();
    }
    
    
    
}
