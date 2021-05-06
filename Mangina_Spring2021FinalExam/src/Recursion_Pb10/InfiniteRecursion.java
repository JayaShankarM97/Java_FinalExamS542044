/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion_Pb10;

/**
 *
 * @author JayaShankar Mangina
 */
public class InfiniteRecursion {
    public static void welcomeScreen(){
        System.out.println("Hello! Welcome to iPhone.");
        welcomeScreen();
    }
    
    public static void main(String[] args) {
        System.out.println("The Solution for the Problem 10(Infinite Recursion):");
        System.out.println("Name: JayaShankar Mangina");
        welcomeScreen();
    }
}
