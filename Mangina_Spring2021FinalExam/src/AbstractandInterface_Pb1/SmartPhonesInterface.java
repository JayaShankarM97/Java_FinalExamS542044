/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractandInterface_Pb1;

/**
 *
 * @author JayaShankar Mangina
 */
public class SmartPhonesInterface implements MobilePhonesInterface{

    @Override
    public void disPlay() {
        System.out.println("LTPO-OLED SUPER RETINA DISPLAY");
    }

    @Override
    public void processor() {
        System.out.println("A14 (5NM) 8-CORE BIONIC PROCESSOR");
    }
    
}
