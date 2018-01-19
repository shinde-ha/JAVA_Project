/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.LenderRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author murta
 */
public class LenderOrganisation extends Organisation {
     public LenderOrganisation() {
        super(Organisation.Type.Lender.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LenderRole());
        return roles;
    }
}
