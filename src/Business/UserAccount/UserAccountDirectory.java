/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.BankAccount.BankAccount;
import Business.BankAccount.BankAccountDirectory;
import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author murta
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
//    private BankAccountDirectory bankAccountDirectory;

    public UserAccountDirectory() {
        
        userAccountList = new ArrayList<>();
//        bankAccountDirectory = new BankAccountDirectory();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }

    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        
        return userAccount;
    }
    
    public BankAccount createBankAccount(String bankName, int SSN, Employee employee,UserAccount userAccount, float bankBalance, String email){
        
        BankAccount bankAccount = new BankAccount();
        bankAccount.setName(bankName);
        bankAccount.setSSN(SSN);
        bankAccount.setEmployee(employee);
        bankAccount.setEmail(email);
        bankAccount.setBankBalance(bankBalance);
        userAccount.setBankAccount(bankAccount);
        System.out.println("reached"+bankAccount.getName());
        return bankAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount userAccount : userAccountList){
            if (userAccount.getUsername().equals(username))
                JOptionPane.showMessageDialog(null," Please choose a unique name");
                return false;
        }
        return true;
    }
    
    
    
}
