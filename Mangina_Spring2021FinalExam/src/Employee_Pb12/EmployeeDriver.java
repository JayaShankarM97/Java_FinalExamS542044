/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee_Pb12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author JayaShankar Mangina
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee E1 = new Employee(01, "Joseph", 10000);
        Employee E2 = new Employee(02, "James", 20000);
        Employee E3 = new Employee(03, "Jordan", 30000);
        Employee E4 = new Employee(04, "Jacob", 40000);
        Employee E5 = new Employee(05, "Josephine", 50000);
        
        System.out.println("The solution for the problem 12(Employee): ");
        System.out.println("Name: JayaShankar Mangina");
        System.out.println("");
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(E1); emp.add(E2); emp.add(E3); emp.add(E4); emp.add(E5);
        
        System.out.println("After Sorting - Ascending order of EmpID");
        Collections.sort(emp);
        
        for(Employee e:emp){
            System.out.println(e.toString());
        }
        System.out.println("");
        System.out.println("After Sorting - Order of empSalary");
        Collections.sort(emp, new Comparator<Employee>(){
            public int compare(Employee arg0, Employee arg1){
                return Double.compare(arg0.getEmpSalary(), arg1.getEmpSalary());
            }
        });
        for(Employee et: emp){
            System.out.println(emp.toString());
        }
        System.out.println("");
        System.out.println("After Sorting - Order of empSalary");
        Collections.sort(emp, new Comparator<Employee>(){
            public int compare(Employee arg0, Employee arg1){
                return arg0.getEmpName().compareTo(arg1.getEmpName());
            }
        });
        for(Employee er: emp){
            System.out.println(emp.toString());
        }
    }
    
}
