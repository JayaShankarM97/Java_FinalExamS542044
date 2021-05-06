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
public class throwsSmartphones {
    public static void throwAway() throws IllegalAccessException{
            System.out.println("Yikes! I just dropped your iPhone in Canal.");
            throw new IllegalAccessException("This is just a Trials");
}
    public static void main(String args[]){
        System.out.println("The Solution for the problem 9(Throws): ");
        System.out.println("Name: JayaShankar Mangina");
        System.out.println("");
        try{
            throwAway();
        }
        catch(IllegalAccessException s){
            System.out.println("It's about time. You should buy a new iPhone.");
        }
    }
}
