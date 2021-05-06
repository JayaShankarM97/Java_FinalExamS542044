/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionsCheckedandUnchecked_Pb6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author JayaShankar Mangina
 */
public class CheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("The Solution for the Problem 6(Checked Exception):");
        System.out.println("Name: JayaShankar Mangina");
        Scanner scan = new Scanner(new File("iPhone.txt"));
        if(scan.hasNext()){
            System.out.println("Open the File to view the contents");
        }
    }
}
