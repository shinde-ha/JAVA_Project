/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;

/**
 *
 * @author manas
 */
public class BankerWorkRequest extends WorkRequest {

    
    private String bankerName;
    private float loanAmount;
    private String message;
     private Employee borrowerName;

    public Employee getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(Employee borrowerName) {
        this.borrowerName = borrowerName;
    }
    

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getBankerName() {
        return bankerName;
    }

    public void setBankerName(String bankerName) {
        this.bankerName = bankerName;
    }

    

    public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }
    
    
    

    
}
