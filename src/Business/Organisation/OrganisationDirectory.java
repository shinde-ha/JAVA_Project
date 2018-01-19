/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Organisation.Organisation.Type;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author murta
 */
public class OrganisationDirectory {

    private ArrayList<Organisation> organisationList;

    public OrganisationDirectory() {
        organisationList = new ArrayList<>();
    }

    public ArrayList<Organisation> getOrganisationList() {
        return organisationList;
    }

    public Organisation createOrganisation(Type type) {
        Organisation organisation = null;
        if (type.getValue().equals(Type.Lender.getValue())) {
            organisation = new LenderOrganisation();
            organisationList.add(organisation);
        } else if (type.getValue().equals(Type.Borrower.getValue())) {
            organisation = new BorrowerOrganisation();
            organisationList.add(organisation);
        } else if (type.getValue().equals(Type.Moderator.getValue())) {
            organisation = new ModeratorOrganisation();
            organisationList.add(organisation);
        } else if (type.getValue().equals(Type.Bank.getValue())) {
            organisation = new BankOrganisation();
            organisationList.add(organisation);
        } else if (type.getValue().equals(Type.Bank.getValue())) {
            organisation = new BankOrganisation();
            organisationList.add(organisation);
        } else if (type.getValue().equals(Type.Government.getValue())) {
            organisation = new GovernmentOrganisation();
            organisationList.add(organisation);
        }

        return organisation;
    }
    
    

}
