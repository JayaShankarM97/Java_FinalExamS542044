/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion_Pb10;

import java.util.Scanner;

/**
 *
 * @author JayaShankar Mangina
 */
public class SearchElement {
    public static int SearchElement(int[] elementsArray, int start, int finish, int s){
        if(start > finish){
            return 0;
        }
        if(elementsArray[start] == s){
            return start;
        }
        return SearchElement(elementsArray, start+1, finish, s);
    }
    
    public static void main(String[] args) {
        int elementsArray[] = new int[20];
        int length = elementsArray.length;
        System.out.println("The Solution for the Problem 10(Search element): ");
        System.out.println("Name: JayaShankar Mangina");
        System.out.println("");
        for(int looper=0; looper<length; looper++){
            elementsArray[looper] = looper*3;
        }
        
        for(int iterator=0; iterator<elementsArray.length-1; iterator++){
            System.out.println(elementsArray[iterator]);
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Please enter the element to search: ");
        
        int s = scanner.nextInt();
        int output = SearchElement(elementsArray, 0, elementsArray.length-1, s);
        System.out.println("");
        if(output == 0){
            System.out.println("Element Not Found");
        }else
            System.out.println("Found the element at the Position: " +output);
    }
}


