/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EqualsandHashCode_Pb11;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author JayaShankar Mangina
 */
public class iPhoneDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The Solution for the Problem 11(Equals and HashCode):");
        System.out.println("Name: JayaShankar Mangina");
        AppleiPhone i1 = new AppleiPhone();
        AppleiPhone i2 = new AppleiPhone();
        
        i1.setSerialID(12546);
        i2.setSerialID(12546);
        
        
        if(i1.hashCode() == i2.hashCode()){
            if(i1.equals(i2)){
                System.out.println("Objects are Equal");
            }
            else
                System.out.println("Objects are not Equal");
        }
        else
            System.out.println("Both the Objects are not at all Equal.");
    }
    
}
