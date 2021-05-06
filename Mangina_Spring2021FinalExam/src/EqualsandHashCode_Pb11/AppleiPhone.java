/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EqualsandHashCode_Pb11;

/**
 *
 * @author JayaShankar Mangina
 * Declaring attributes
 */
public class AppleiPhone {
    private int serialID;
    private String ModelNumber;
    private String display;
    private String processor;

    /**
     * Initiated an empty constructor
     */
    public AppleiPhone() {
        
    }

    /**
     * Getter methods to get the values from the respective attributes
     * @return 
     */
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

    /**
     * Setter methods to set the values for respective attributes
     * @param serialID 
     */
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

    /**
     * We are overriding the default equals() method provided by the java
     * in order to achieve desired output and application behavior
     * If we don't override the equals() method , the java would look up to the,
     * methods defined by the object class and executes them,
     * which in return we get objects address.In the below method, we are
     * evaluating the conditions through which we get to know whether the,
     * the objects we created and the objects that Java has built within is,
     * having the same contents and values.
     * @param obj
     * @return 
     */
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

    /**
     * As we overridden the equals() method, we must override the hashCode(),
     * method.The HashCode() method optimize performance when comparing objects.When
     * both the objects aren't same in hashcode() we need not to use equals() method.This
     * method will compare both the object references and the contents in both
     * the objects and returns true if the objects passes all the conditions.
     * @return 
     */
    @Override
    public int hashCode() {
         final int NUMBER = 31;
         int flag = 1;
         flag = NUMBER * flag+ getSerialID();
         return flag;
    }

    
    
}
