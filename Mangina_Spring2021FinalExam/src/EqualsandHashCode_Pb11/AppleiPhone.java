/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EqualsandHashCode_Pb11;

/**
 *
 * @author JayaShankar Mangina
 */
public class AppleiPhone {
    private int serialID;
    private String ModelNumber;
    private String display;
    private String processor;

    public AppleiPhone() {
        
    }

    public int getSerialID() {
        return serialID;
    }

    public String getModelNumber() {
        return ModelNumber;
    }

    public String getDisplay() {
        return display;
    }

    public String getProcessor() {
        return processor;
    }

    public void setSerialID(int serialID) {
        this.serialID = serialID;
    }

    public void setModelNumber(String ModelNumber) {
        this.ModelNumber = ModelNumber;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        
        AppleiPhone i = (AppleiPhone) obj;
        return (this.getSerialID() == i.getSerialID());
    }

    @Override
    public int hashCode() {
         final int NUMBER = 31;
         int flag = 1;
         flag = NUMBER * flag+ getSerialID();
         return flag;
    }

    
    
}
