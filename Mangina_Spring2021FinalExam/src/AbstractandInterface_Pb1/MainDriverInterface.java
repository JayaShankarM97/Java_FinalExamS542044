/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractandInterface_Pb1;

/**
 *
 * @author JayaShankar Mangina
 */
public class MainDriverInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SmartPhonesInterface SI = new SmartPhonesInterface();
        System.out.println("The Solution for Problem 1(Interface): ");
        System.out.println("Name: JayaShankar Mangina");
        System.out.println("");
        SI.disPlay();
        SI.processor();
    }
    
}
