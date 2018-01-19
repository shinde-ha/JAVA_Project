/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Government;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organisation.BankOrganisation;
import Business.Organisation.BorrowerOrganisation;
import Business.Organisation.LenderOrganisation;
import Business.Organisation.ModeratorOrganisation;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ModeratorRequest;
import Business.WorkQueue.LenderWorkRequest;
import Business.WorkQueue.ModeratorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author murta
 */
public class ViewFinancialsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFinancialsJPanel
     */
    private JPanel rightContainer;
   
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Ecosystem system;

    public ViewFinancialsJPanel(JPanel rightContainer,Enterprise enterprise,UserAccount userAccount, Ecosystem system) {
        initComponents();
        this.rightContainer=rightContainer;
        this.enterprise=enterprise;
        this.userAccount=userAccount;
        this.system=system;
        
        populateLenderTable();
        populateBorrowerTable();
        populateModeratorTable();
    }
    
    
     
    private void populateLenderTable(){
        DefaultTableModel model = (DefaultTableModel) tblLenderFinDetails.getModel();
        
        model.setRowCount(0);
        
       for (Organisation org : enterprise.getOrganisationDirectory().getOrganisationList()){
           for(WorkRequest request : org.getWorkQueue().getWorkRequestList())
            if(request instanceof LenderWorkRequest){
                Object[] row = new Object[3];
                row[0] = request;
                row[1] = request.getStatus();
                row[2] = ((LenderWorkRequest) request).getDonatedAmount();
                
                model.addRow(row);
            }
        }
        
    }
    
    private void populateBorrowerTable(){
        DefaultTableModel model = (DefaultTableModel) tblBorrowerFinDetails.getModel();
        
        model.setRowCount(0);
        for (Organisation org : enterprise.getOrganisationDirectory().getOrganisationList()){ 
           for (WorkRequest request : org.getWorkQueue().getWorkRequestList()){
                if(request instanceof ModeratorRequest){
                    Object[] row = new Object[3];
                    row[0] = request;
                    row[1] = request.getStatus();
                    row[2] = ((ModeratorRequest) request).getLoanAmount();
    //              row[3]=  ((ModeratorRequest) request).getInterestRate();
                    model.addRow(row);
                }
            }
        }    
    }
    
    private void populateModeratorTable(){
        DefaultTableModel model = (DefaultTableModel) tblModeratorFinDetails.getModel();
        
        model.setRowCount(0);
      for (Organisation org : enterprise.getOrganisationDirectory().getOrganisationList()){ 
        for (WorkRequest request : org.getWorkQueue().getWorkRequestList()){
             if(request instanceof ModeratorWorkRequest){
                 Object[] row = new Object[2];
                 row[0] = request;
                 row[1] = request.getStash();

                 model.addRow(row);
             }
         }
      } 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLenderFinDetails = new javax.swing.JTable();
        btnViewLender = new javax.swing.JButton();
        btnViewFinDetails = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBorrowerFinDetails = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblModeratorFinDetails = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        tblLenderFinDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Work Request Status", "Amount Donated"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLenderFinDetails);

        btnViewLender.setText("View Lenders");
        btnViewLender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewLenderActionPerformed(evt);
            }
        });

        btnViewFinDetails.setText("View Financial Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewLender)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(btnViewFinDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnViewLender)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewFinDetails)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lender Details", jPanel1);

        tblBorrowerFinDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Work Request Status", "Loan Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblBorrowerFinDetails);

        jButton1.setText("View Borrowers");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Borrower Details", jPanel2);

        tblModeratorFinDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Stash Amount"
            }
        ));
        jScrollPane3.setViewportView(tblModeratorFinDetails);

        jButton2.setText("View Moderator Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Moderator Details", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewLenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewLenderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewFinDetails;
    private javax.swing.JButton btnViewLender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblBorrowerFinDetails;
    private javax.swing.JTable tblLenderFinDetails;
    private javax.swing.JTable tblModeratorFinDetails;
    // End of variables declaration//GEN-END:variables
}