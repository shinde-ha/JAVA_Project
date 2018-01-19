/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Harsh $hinde
 */
public class LenderWorkRequest extends WorkRequest{
    
    private String lenderName;
    private float donatedAmount;
    private int duration;
    private boolean loanSanctioned;
    

    public boolean isLoanSanctioned() {
        return loanSanctioned;
    }

    public void setLoanSanctioned(boolean loanSanctioned) {
        this.loanSanctioned = loanSanctioned;
    }
    
    

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLenderName() {
        return lenderName;
    }

    public void setLenderName(String lenderName) {
        this.lenderName = lenderName;
    }

    public float getDonatedAmount() {
        return donatedAmount;
    }

    public void setDonatedAmount(float donatedAmount) {
        this.donatedAmount = donatedAmount;
    }

   
    
    
}
