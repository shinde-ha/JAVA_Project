/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BankAccount;

import Business.Employee.Employee;

/**
 *
 * @author murta
 */
public class BankAccount {
    
    private String name;
    private int SSN;
    private float bankBalance;
    private Employee employee;
//    private int reputationScore;
    
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    

    public float getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(float bankBalance) {
        this.bankBalance = bankBalance;
    }

//    public int getReputationScore() {
//        return reputationScore;
//    }
//
//    public void setReputationScore(int reputationScore) {
//        this.reputationScore = reputationScore;
//    }
    
    
    
    

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    @Override
    
    public String toString(){
        return name;
    }
}
