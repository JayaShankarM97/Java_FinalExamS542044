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
public class FAANGDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The Solution for the Problem 3(Casting): ");
        System.out.println("Name: JayaShankar Mangina");
        FAANG F = new AppleCompany();
        F.companyName = "Apple";
        
        AppleCompany A = (AppleCompany)F;
        A.companyRanking = 01;
        
        
        System.out.println(A.companyName);
        System.out.println(A.companyRanking);
        A.display();
        
    }
    
}
