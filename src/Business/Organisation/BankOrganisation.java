/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.BankRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author murta
 */
public class BankOrganisation extends Organisation{

    public BankOrganisation() {
        super(Organisation.Type.Bank.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BankRole());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
    
}
