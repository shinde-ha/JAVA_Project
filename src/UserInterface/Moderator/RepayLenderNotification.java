/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Moderator;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organisation.BorrowerOrganisation;
import Business.Organisation.ModeratorOrganisation;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BorrowerLoanRepayRequest;
import Business.WorkQueue.ModeratorRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manas
 */
public class RepayLenderNotification extends javax.swing.JPanel {

    /**
     * Creates new form RepayLenderNotification
     */
    private JPanel rightContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private Ecosystem system;
    public RepayLenderNotification(JPanel rightContainer, Enterprise enterprise, UserAccount account, Ecosystem system) {
        initComponents();
        this.rightContainer = rightContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.system = system;
    }
    
     private void populateTableLender() {
        
         float total = 0;
        float stash = 0;
         

        Organisation org = null;
        for (Organisation organisation : enterprise.getOrganisationDirectory().getOrganisationList()) {
            if (organisation instanceof ModeratorOrganisation) {
                org = organisation;
                break;
            }
        }
        if (org != null) {
            DefaultTableModel model = (DefaultTableModel) tableLender.getModel();

            model.setRowCount(0);
            for (WorkRequest request : org.getWorkQueue().getWorkRequestList()) {
                if (request instanceof ModeratorRequest) {
                    Object[] row = new Object[4];
                    row[0] = request;
                    row[1] = request.getMessage();
                    row[2] = ((BorrowerLoanRepayRequest) request).getReceiver();
                    row[3] = ((BorrowerLoanRepayRequest) request).getRepayAmount();
                    
                    
                    stash=((ModeratorRequest) request).getReceiver().getBankAccount().getBankBalance();
                    float modBankBalance = ((ModeratorRequest) request).getLender1().getBankAccount().getBankBalance();
                    
                    

                    model.addRow(row);
                }
            }
            
            
            
        }
        account.getBankAccount().setBankBalance(total);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableLender = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        tableLender.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableLender);

        jLabel1.setText("Repay Lender");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(383, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableLender;
    // End of variables declaration//GEN-END:variables
}
