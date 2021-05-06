/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionsCheckedandUnchecked_Pb6;

/**
 *
 * @author JayaShankar Mangina
 */
public class UncheckedException {
    public static void main(String[] args) {
        System.out.println("The Solution for the Problem 6(Unchecked Exception):");
        System.out.println("Name: JayaShankar Mangina");
        int firstDigit = 10;
        int secondDigit = 0;
        try{
            int thirdDigit = firstDigit/secondDigit;
        }
        catch(Exception e){
            System.out.println("");
            System.out.println(e);
        }
    }
}
