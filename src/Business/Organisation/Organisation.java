/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.BankAccount.BankAccountDirectory;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author murta
 */
public abstract class Organisation {
    
    private String name;
    private String sSN;
    private String reputationScore;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
//    private BankAccountDirectory bankAccountDirectory;
    private int organizationID;
    private static int counter;
    
    public enum Type{
    

        Admin("Admin Organisation"),Lender("LenderOrganization"),Borrower("BorrowerOrganization"),Moderator("ModeratorOrganization"),Bank("Bank"),Government("Government");

        private String value;
        
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organisation(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
//        bankAccountDirectory = new BankAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }


    public String getsSN() {
        return sSN;
    }

    public void setsSN(String sSN) {
        this.sSN = sSN;
    }

    public String getReputationScore() {
        return reputationScore;
    }

    public void setReputationScore(String reputationScore) {
        this.reputationScore = reputationScore;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organisation.counter = counter;
    }
    
    

    public UserAccount findMaxValue(){
        int max=0;
        
         for(UserAccount u: getUserAccountDirectory().getUserAccountList()){
//         Employee e = Employee.getCount(); 
            if(u.getCount()>max){
                max=u.getCount();
                
            }
         }
        return null;
        
       
   
    }
        
        @Override
        public String toString() {
        return name;
        }
}
