/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author murta
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        
        employeeList.add(employee);
        return employee;
    }
    
     public Employee createEmployee(String name,String desc,int ssn){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setDescrpition(desc);
        employee.setSsn(ssn);
        employeeList.add(employee);
        return employee;
    }
    
    public void deleteEmployee(Employee employee){
       
       
        employeeList.remove(employee);
        
    }
    
    
    
}
