/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComparableCircle_Pb5;

/**
 *
 * @author JayaShankar Mangina
 */
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComparableCircle C1 = new ComparableCircle(4.0);
        ComparableCircle C2 = new ComparableCircle(8.0);
        System.out.println("The Solution for the Problem 5(Colorable): ");
        System.out.println("Name: JayaShankar Mangina");
        System.out.println("");
        System.out.println("The First Circle Values: ");
        System.out.println(C1);
        System.out.println("");
        System.out.println("The Second Circle Values: ");
        System.out.println(C2);
        System.out.println((C1.compareTo(C2) == 1 ? "First Circle" : "Second Circle") + " is the largest between the two Circles.");
    }
    
}
