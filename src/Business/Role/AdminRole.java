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
import UserInterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author murta
 */
public class AdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel leftContainer, JPanel rightContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Ecosystem business) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new AdminWorkAreaJPanel(leftContainer, rightContainer, enterprise, account, business,organisation);
    }
    @Override 
    public String toString(){
    return Role.Type.ADMIN.getValue();
}
}