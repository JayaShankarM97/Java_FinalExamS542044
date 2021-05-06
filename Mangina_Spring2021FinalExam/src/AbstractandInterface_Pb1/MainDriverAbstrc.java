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
public class MainDriverAbstrc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SmartPhonesAbstrct s = new SmartPhonesAbstrct();
        
        System.out.println("Name: JayaShankar Mangina");
        System.out.println("The Solution for the Problem 1 (Abstract):");
        System.out.println("");
        s.brandLogo();
        s.NameOfTheBrand();
        s.PriceOfTheMobilePhone();
        
        
        
    }
    
}
