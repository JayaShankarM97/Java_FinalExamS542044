/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee_Pb12;

/**
 *
 * @author JayaShankar Mangina
 */
public class Employee implements Comparable<Employee>{

    private int empID;
    private String empName;
    private int empSalary;

    public Employee(int empID, String empName, int empSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }
    
    @Override
    public int compareTo(Employee arg0) {
        if( empID == arg0.getEmpID() ){
            return 0;
        }else if( empID > arg0.getEmpID() ){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Employee{" + "empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + '}';
    }
    
    
    
    
}
