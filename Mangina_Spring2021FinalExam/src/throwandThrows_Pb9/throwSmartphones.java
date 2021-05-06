/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwandThrows_Pb9;

/**
 *
 * @author JayaShankar Mangina
 */
public class throwSmartphones {
    public static void throwAway(){
        try{
            throw new NullPointerException("Just Trying to throw the phone away");
        }
        catch(NullPointerException s){
            System.out.println("Phew! I just threw your phone.");
            throw s;
        }
    }
    
    public static void main(String args[]){
        System.out.println("The Solution for the problem 9(Throw): ");
        System.out.println("Name: JayaShankar Mangina");
        System.out.println("");
        try{
            throwAway();
        }
        catch(NullPointerException s){
            System.out.println("It's time to buy a new iPhone.");
        }
    }
}
