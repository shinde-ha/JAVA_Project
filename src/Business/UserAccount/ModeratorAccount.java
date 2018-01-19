/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

/**
 *
 * @author manas
 */
public class ModeratorAccount extends UserAccount {
     private int bankBalance;

    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }
      
    
   public int addMoney(int donatedAmount){
   bankBalance=0;
   
   if(donatedAmount!=0)
   {
   bankBalance+=donatedAmount;
           
   
   }
   return bankBalance;
   
   
   } 
     
     
     
    
    
    
    
}
