/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.AdminRole;
import Business.Role.BorrowerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author manas
 */
public class AdminOrganisation extends Organisation {
    public AdminOrganisation() {
        super(Organisation.Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
}
