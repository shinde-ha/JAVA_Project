/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.LenderRole;
import Business.Role.ModeratorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author murta
 */
public class ModeratorOrganisation extends Organisation{

    
    public ModeratorOrganisation() {
        super(Organisation.Type.Moderator.getValue()); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ModeratorRole());
        return roles;
    
    
    
    
    
    
    
}
}
