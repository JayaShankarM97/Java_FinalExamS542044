/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColorableInterface_Pb2;

/**
 *
 * @author JayaShankar Mangina
 */
public class ColorableDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The Solution for the Problem 2(Colorable): ");
        System.out.println("Name: JayaShankar Mangina");
        System.out.println("");
        
        Colorable C1 = new Square(4.0);
        Colorable C2 = new Square(9.0);
        Colorable C3 = new Square(16.0);
        Colorable C4 = new Square(25.0);
        Colorable C5 = new Square(36.0);
        
        GeometricObject[] GO = new GeometricObject[5];
        GO[0] = (GeometricObject) C1;
        GO[1] = (GeometricObject) C2;
        GO[2] = (GeometricObject) C3;
        GO[3] = (GeometricObject) C4;
        GO[4] = (GeometricObject) C5;
        
        for(GeometricObject i : GO){
            System.out.println("Area of the Square: " +i.AreaOfTheSquare());
            i.howToColor();
            System.out.println("");
        }
    }
    
}
