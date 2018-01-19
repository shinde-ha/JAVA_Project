/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Lender;

import Business.BankAccount.BankAccount;
import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author murta
 */
public class LenderFuntionsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LenderFuntionsJPanel
     */
    private JPanel rightContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Ecosystem system;
    
    public LenderFuntionsJPanel(JPanel rightContainer, Enterprise enterprise, UserAccount userAccount, Ecosystem system) {
        initComponents();
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = userAccount;
        this.rightContainer = rightContainer;
        populateBorrowerTable();
        populateAssignRequestTable();
        checkLender();
        txtLenBankBalance.setText(Float.toString(userAccount.getBankAccount().getBankBalance()));
    }
    public void checkLender(){
    
    
    
    
    
    }
    
    
//    public void populateDonateTable(){
//        DefaultTableModel model = (DefaultTableModel) tblLender.getModel();
//        model.setRowCount(0);
//        
//        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
//            if(request instanceof LenderWorkRequest){
//                Object[] row = new Object[4];
//                row[0] = request;
//                row[2] = ((LenderWorkRequest) request).getDonatedAmount();
//                row[1] = request.getMessage();
//                row[3] = ((LenderWorkRequest) request).getDuration();    
//                model.addRow(row);
//            }
//        }
//    }
    
     public void populateBorrowerTable(){
        Organisation org = null;
        for (Organisation organization : enterprise.getOrganisationDirectory().getOrganisationList()){
            if (organization instanceof ModeratorOrganisation){
                org = organization;
                break;
            }
        }
        if (org!=null){
         
            DefaultTableModel model = (DefaultTableModel) tblBorrowerWorkRequests.getModel();
            model.setRowCount(0);
        
            for(WorkRequest request: org.getWorkQueue().getWorkRequestList()){
                if(request instanceof ModeratorRequest){
                    Object[] row = new Object[6];
                    row[0] = request;
                    row[5]=((ModeratorRequest) request).getDuration();
                    row[1] = ((ModeratorRequest) request).getReceiver();
                    row[2]=request.getStatus();
                    row[3] = ((ModeratorRequest) request).getLoanAmount();
                    row[4]=((ModeratorRequest) request).getLender1();
                    model.addRow(row);       
                }
            }   
        }
    }
     
//     private void populateLoanRepaidComboBox() {
//
//        comboBoxLoanRepaid.removeAllItems();
//        Organisation org = null;
//        for (Organisation organization : enterprise.getOrganisationDirectory().getOrganisationList()) {
//            if (organization instanceof BorrowerOrganisation) {
//                org = organization;
//                break;
//            }
//        }
//        if (org != null) {
//        for (Employee emp : org.getEmployeeDirectory().getEmployeeList()) {
////          if(emp.get) 
////                String borrowerName=emp.getName();
////                comboBoxLoanRepaid.addItem(borrowerName);
////Jab loan request banega tab kar lege
////employee based on status of loan request
//
//            }
//        }
//
//    }
//    private void populateLoanNotPaidComboBox() {
//
//        comboBoxLoanRepaid.removeAllItems();
//        Organisation org = null;
//        for (Organisation organization : enterprise.getOrganisationDirectory().getOrganisationList()) {
//            if (organization instanceof BorrowerOrganisation) {
//                org = organization;
//                break;
//            }
//        }
//        if (org != null) {
//
//            for (Employee emp : org.getEmployeeDirectory().getEmployeeList()) {
//                 String borrowerName=emp.getName();
//                comboBoxLoanNotPaid.addItem(borrowerName);
//
//            }
//        }
//
//    }
     
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAddMoney = new javax.swing.JTextField();
        btnAddMoney = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        txtLenBankBalance = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAssignRequest = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBorrowerWorkRequests = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnDonate1 = new javax.swing.JButton();
        donateFundTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtLenderMessage1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("My Account Summary");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Add Money to Wallet");

        btnAddMoney.setText("Add money");
        btnAddMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMoneyActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Remaining Balance");

        txtBalance.setEditable(false);
        txtBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBalanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnAddMoney))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(txtLenBankBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(584, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtAddMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnAddMoney)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addComponent(txtLenBankBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("My Wallet", jPanel2);

        tblAssignRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Amount"
            }
        ));
        jScrollPane4.setViewportView(tblAssignRequest);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(428, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Assign Request", jPanel3);

        tblBorrowerWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "sender", "receiver", "status", "LoanAmount", "Lender", "Duration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBorrowerWorkRequests);

        jButton1.setText("jButton1");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnDonate1.setText("Donate");
        btnDonate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonate1ActionPerformed(evt);
            }
        });

        donateFundTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateFundTextField1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Fund to donate:");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefresh)
                .addGap(355, 355, 355))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnDonate1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(486, 486, 486))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(txtLenderMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(donateFundTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(380, 380, 380))))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(360, 360, 360)
                    .addComponent(jLabel12)
                    .addContainerGap(670, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnRefresh)
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLenderMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(donateFundTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnDonate1)
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(294, 294, 294)
                    .addComponent(jLabel12)
                    .addContainerGap(260, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("DonateFunds", jPanel4);

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

    private void btnDonate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonate1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int selectedRow = tblBorrowerWorkRequests.getSelectedRow();

        if (selectedRow < 0){
            
            JOptionPane.showMessageDialog(null,"Select a row");
            return;
        }
        
        String message = txtLenderMessage1.getText();
        int fundsToDonate = 0;
         
        if (message.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter something to send.");
            return;
        }
        
        try{
           fundsToDonate = Integer.parseInt(donateFundTextField1.getText());
       }
       
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Please fill up Donation Amount in numeric values!!");
           return;
       }
        
        
        ModeratorRequest request = ( ModeratorRequest)tblBorrowerWorkRequests.getValueAt(selectedRow, 0);
           request.setLenderMessage(txtLenderMessage1.getText());
           request.setLentAmount(Integer.parseInt(donateFundTextField1.getText()));
           request.setStatus("Approved");
           
            float amount = Float.parseFloat(donateFundTextField1.getText());
           
                  int duration = 0;
                if(amount<=50){
                        duration = 6;
                    }
                else if(amount>50 || amount<250 ){
                        duration = 12;
                    }
                else if(amount>250 || amount <1000){
                        duration = 24;
                    }
                else if(amount>1000 || amount<2500){
                        duration = 36;
                    }
                request.setDuration(duration);
           JOptionPane.showMessageDialog(null, "Message sent to Moderator");
           
//    
        
//        
//
//                WorkRequest  wr = (WorkRequest)tblBorrower.getValueAt(selectedRow, 0);
//                userAccount.getWorkQueue().getPersonalRequestList().add(wr);
//
//                String message = donateFundTextField.getText();
//                if(message.equals("") || message.isEmpty()){
//                        JOptionPane.showMessageDialog(null, "Please enter something to send.");
//                        return;
//                    }
//                float amount = Float.parseFloat(donateFundTextField.getText());
//                
//
//                String lenderMessage = txtLenderMessage.getText();
//
//                request.setReceiver((UserAccount)tblBorrower.getValueAt(selectedRow, 0));
//
//                Organisation org = null;
//                for (Organisation organization : enterprise.getOrganisationDirectory().getOrganisationList()){
//                        if (organization instanceof LenderOrganisation){
//                                org = organization;
//                                break;
//                            }
//                    }
//                if (org!=null){
//                        org.getWorkQueue().getWorkRequestList().add(request);
//                        userAccount.getWorkQueue().getWorkRequestList().add(request);
//                    }
    }//GEN-LAST:event_btnDonate1ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblBorrowerWorkRequests.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        ModeratorRequest request = ( ModeratorRequest)tblBorrowerWorkRequests.getValueAt(selectedRow, 0);
        request.setLender1(userAccount);

        populateBorrowerTable();

    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBalanceActionPerformed

    private void btnAddMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMoneyActionPerformed
        // TODO add your handling code here:
        float money = Float.parseFloat(txtAddMoney.getText());
        float total = userAccount.getBankAccount().getBankBalance();
        userAccount.getBankAccount().setBankBalance(total + money);
    }//GEN-LAST:event_btnAddMoneyActionPerformed

    private void donateFundTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateFundTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_donateFundTextField1ActionPerformed
    
    public void populateAssignRequestTable(){
        
        Organisation org = null;
        for (Organisation organisation : enterprise.getOrganisationDirectory().getOrganisationList()) {
            if (organisation instanceof LenderOrganisation) {
                org = organisation;
                break;
            }
        }
        if (org != null) {
            DefaultTableModel model = (DefaultTableModel) tblAssignRequest.getModel();
            model.setRowCount(0);
       
            for(WorkRequest request : org.getWorkQueue().getWorkRequestList()){            
                if(request instanceof LenderWorkRequest){
                Object[] row = new Object[5];
                row[1] = request;
                row[0] = request.getMessage();
//              row[2] = request.getRequestDate() == null ? null : request.getRequestDate();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[3] = request.getStatus();
                row[4] = ((LenderWorkRequest) request).getDonatedAmount();
//              row[4] = request.getResolveDate() ==null ? null : request.getResolveDate();
//              row[4] = request.get
                model.addRow(row);
                }
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMoney;
    private javax.swing.JButton btnDonate1;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JTextField donateFundTextField1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblAssignRequest;
    private javax.swing.JTable tblBorrowerWorkRequests;
    private javax.swing.JTextField txtAddMoney;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtLenBankBalance;
    private javax.swing.JTextField txtLenderMessage1;
    // End of variables declaration//GEN-END:variables
}
