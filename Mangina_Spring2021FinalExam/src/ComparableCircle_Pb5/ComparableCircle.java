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
public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

    public ComparableCircle(){
    }

    public ComparableCircle(double radiusOfCircle) {
        super(radiusOfCircle);
    }
    
    
    @Override
    public int compareTo(ComparableCircle o) {
        if(AreaOfCircle() > o.AreaOfCircle()){
            return 1;
        }
        else if( AreaOfCircle() < o.AreaOfCircle() ){
            return -1;
        }
        else{
            return 0;
        }
    }
    
}
