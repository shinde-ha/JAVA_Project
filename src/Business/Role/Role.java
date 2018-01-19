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
import javax.swing.JPanel;

/**
 *
 * @author murta
 */
public abstract class Role {
    
    public enum Type{
        ADMIN("Admin"),Borrower("Borrower"),Lender("Lender"),Moderator("Moderator"),Bank("Bank"),Government("Government");
        
        private String value;
        
        private Type(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    
        @Override
        public String toString() {
            return value;
        }

    }
    
    public abstract JPanel createWorkArea(JPanel container,JPanel userProcessContainer,UserAccount account, 
                                          Organisation organisation, Enterprise enterprise,Ecosystem business);

    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}