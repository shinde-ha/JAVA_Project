 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.GovernmentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author murta
 */
public class GovernmentOrganisation extends Organisation{

    public GovernmentOrganisation() {
        super(Organisation.Type.Government.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GovernmentRole());
        return roles; //To change body of generated methods, choose Tools | Templates.
    }
    
}
