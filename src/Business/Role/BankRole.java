/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import UserInterface.Bank.BankWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Harsh $hinde
 */
public class BankRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel leftContainer, JPanel rightContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Ecosystem business) {
        return new BankWorkAreaJPanel(leftContainer, rightContainer, enterprise, account, business); //To change body of generated methods, choose Tools | Templates.
    }
    @Override 
    public String toString(){
    return Role.Type.Bank.getValue();
}
    
}
