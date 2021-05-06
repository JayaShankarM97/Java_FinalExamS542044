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
public class Recursion {
    public static int sum(int s){
        if(s>0){
            return s + sum(s-1);
        }else{
            return 0;
        }
    }
    
    public static void main(String[] args) {
        int res = sum(20);
        System.out.println("The Solution for the problem 10(Recursion): ");
        System.out.println("Name: JayaShankar Mangina");
        System.out.println(res);
    }
}
