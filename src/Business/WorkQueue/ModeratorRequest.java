/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author murta
 */
public class ModeratorRequest extends WorkRequest {

    private int loanAmount;
    private int pendingAmount;
    private int lentAmount = 0;
    private String lenderMessage;
    private int repayAmount;
     private String lenderName;
     private int remainingAmont;
     

    public int getRepayAmount() {
        return repayAmount;
    }

    public void setRepayAmount(int repayAmount) {
        this.repayAmount = repayAmount;
    }

    public String getLenderName() {
        return lenderName;
    }

    public void setLenderName(String lenderName) {
        this.lenderName = lenderName;
    }

    public int getRemainingAmont() {
        return remainingAmont;
    }

    public void setRemainingAmont(int remainingAmont) {
        this.remainingAmont = remainingAmont;
    }

    public String getLenderMessage() {
        return lenderMessage;
    }

    public void setLenderMessage(String lenderMessage) {
        this.lenderMessage = lenderMessage;
    }

    private UserAccount lender1;

    private int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPendingAmount() {
        return pendingAmount;
    }

    public void setPendingAmount(int pendingAmount) {
        this.pendingAmount = pendingAmount;
    }

    public int getLentAmount() {
        return lentAmount;
    }

    public void setLentAmount(int lentAmount) {
        this.lentAmount = lentAmount;
    }

    public UserAccount getLender1() {
        return lender1;
    }

    public void setLender1(UserAccount lender1) {
        this.lender1 = lender1;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

}
