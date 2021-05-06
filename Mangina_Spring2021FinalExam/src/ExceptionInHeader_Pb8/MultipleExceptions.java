/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionInHeader_Pb8;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author JayaShankar Mangina
 */
public class MultipleExceptions {
    public static void NumberDisplay() throws IOException{
        throw new IOException("");
    }
    
    public static void main(String[] args) throws IOException {
        System.out.println("The Solution for the problem 8(Multiple Exceptions):");
        System.out.println("Name: JayaShankar Mangina");
        System.out.println("Enter the Number:");
        Scanner scan = new Scanner(System.in);
        int ID = scan.nextInt();
        try{
            if(ID < 0){
                NumberDisplay();
            }else{
                System.out.println("ID is Invalid. Please scan the ID again.");
            }
        }
        catch(Exception e){
            System.out.println("Exception got handled. Your ID is Valid now.");
        }
    }
}
