/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Employee.EmployeeDirectory;
import Business.Organisation.Organisation;
import Business.Organisation.OrganisationDirectory;

/**
 *
 * @author murta
 */
public abstract class Enterprise extends Organisation{
    
    private EnterpriseType enterpriseType;
    private OrganisationDirectory organisationDirectory;
    private EmployeeDirectory employeeDirectory;
    
    public Enterprise(String name, EnterpriseType type){
        
        super(name);
        this.enterpriseType = type;
        organisationDirectory = new OrganisationDirectory();
        employeeDirectory = new EmployeeDirectory();
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    public OrganisationDirectory getOrganisationDirectory() {
        return organisationDirectory;
    }

    public void setOrganisationDirectory(OrganisationDirectory organisationDirectory) {
        this.organisationDirectory = organisationDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }
    
    public enum EnterpriseType{
        Master("Master Enterprise");
        
        private String value;

        private EnterpriseType(String value) {
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
}
