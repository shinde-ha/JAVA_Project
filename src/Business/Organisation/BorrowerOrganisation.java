/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.BorrowerRole;
import Business.Role.LenderRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author murta
 */
public class BorrowerOrganisation extends Organisation {
    
    public BorrowerOrganisation() {
        super(Organisation.Type.Borrower.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BorrowerRole());
        return roles;
    }
    
}
