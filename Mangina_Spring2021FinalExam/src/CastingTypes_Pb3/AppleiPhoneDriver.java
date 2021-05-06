/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CastingTypes_Pb3;

/**
 *
 * @author JayaShankar Mangina
 */
public class AppleiPhoneDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The Solution for the Problem 3(Casting): ");
        System.out.println("Name: JayaShankar Mangina");
        Apple A1 = (Apple) new iPhone();
        Apple A2 = (Apple) new iPhone();
        A1.printTheScreen();
        A2.printTheScreen();
    }
    
}
