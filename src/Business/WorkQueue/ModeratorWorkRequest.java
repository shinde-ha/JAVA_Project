/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.UserAccount.UserAccount;

/**
 *
 * @author murta
 */
public class ModeratorWorkRequest extends WorkRequest{
    
    private String ModeratorName;
    private String donatedAmount;
    private UserAccount selectedBorrower;
    private float loanAmount;
    private float donation;
    private UserAccount selectedLender;
    
    
    public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public float getDonation() {
        return donation;
    }

    public void setDonation(float donation) {
        this.donation = donation;
    }
    

    public UserAccount getSelectedBorrower() {
        return selectedBorrower;
    }

    public void setSelectedBorrower(UserAccount selectedBorrower) {
        this.selectedBorrower = selectedBorrower;
    }
   
    public String getModeratorName() {
        return ModeratorName;
    }

    public void setModeratorName(String ModeratorName) {
        this.ModeratorName = ModeratorName;
    }


    public String getDonatedAmount() {
        return donatedAmount;
    }

    public void setDonatedAmount(String donatedAmount) {
        this.donatedAmount = donatedAmount;
    }

    
    
    
    
}
