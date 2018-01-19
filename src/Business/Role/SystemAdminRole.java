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
import UserInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author murta
 */
public class SystemAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel leftcontainer, JPanel rightContainer, UserAccount account,
                                 Organisation organisation, Enterprise enterprise, Ecosystem system) {
        
        return new SystemAdminWorkAreaJPanel(leftcontainer,rightContainer,system);
    }
}
