/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomIntegers_Pb7;

import java.util.Scanner;

/**
 *
 * @author JayaShankar Mangina
 */
public class RandomIntegersGenerate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] randomIntegerArray = new int[100];
        System.out.println("The Solution for the Problem 7(Random Array): ");
        System.out.println("Name: JayaShankar Mangina");
        System.out.println("");
        for(int i=0; i<randomIntegerArray.length; i++){
            randomIntegerArray[i] = (int)(Math.random()*100);
        }
        
        System.out.println("Enter the index you want to retrieve from the Array: ");
        int indexTORetrieve = scan.nextInt();
        if(indexTORetrieve >=0 && indexTORetrieve <= 99){
            System.out.println("The Element at "+indexTORetrieve+" is "+randomIntegerArray[indexTORetrieve]);
        }else
            System.out.println("Out of Bounds");
    }
    
}
