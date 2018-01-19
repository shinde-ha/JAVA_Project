/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author manas
 */
public class BorrowerLoanRepayRequest extends WorkRequest {

    private float repayAmount;
    private String lenderName;
    private int remainingAmont;

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

    public float getRepayAmount() {
        return repayAmount;
    }

    public void setRepayAmount(float repayAmount) {
        this.repayAmount = repayAmount;
    }

}
