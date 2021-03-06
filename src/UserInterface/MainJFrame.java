/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.BankAccount.BankAccount;
import Business.DB4Outil.DB4Outil;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;

import UserInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author murta
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private Ecosystem system;
    private DB4Outil dB4OUtil = DB4Outil.getInstance();
    public MainJFrame() {
        initComponents();
          system = dB4OUtil.retrieveSystem();
    
    }

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        UsernameText = new javax.swing.JTextField();
        BTNLogin = new javax.swing.JButton();
        BTNLogout = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSplitPane2 = new javax.swing.JSplitPane();
        leftContainer = new javax.swing.JPanel();
        rightContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(javax.swing.UIManager.getDefaults().getColor("PasswordField.selectionBackground"));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 112, 24));

        UsernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextActionPerformed(evt);
            }
        });
        jPanel1.add(UsernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 120, -1));

        BTNLogin.setText("Login");
        BTNLogin.setBorder(new javax.swing.border.MatteBorder(null));
        BTNLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLoginActionPerformed(evt);
            }
        });
        jPanel1.add(BTNLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 90, 20));

        BTNLogout.setText("Logout");
        BTNLogout.setBorder(new javax.swing.border.MatteBorder(null));
        BTNLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(BTNLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, 90, 20));
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/sm_1.png"))); // NOI18N
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 170));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.selectionBackground"));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 112, 22));

        SplitPane1.setTopComponent(jPanel1);

        jSplitPane2.setPreferredSize(new java.awt.Dimension(900, 600));

        leftContainer.setMinimumSize(new java.awt.Dimension(350, 524));
        leftContainer.setLayout(new java.awt.CardLayout());
        jSplitPane2.setLeftComponent(leftContainer);

        rightContainer.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(rightContainer);

        SplitPane1.setBottomComponent(jSplitPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1104, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLoginActionPerformed
        // TODO add your handling code here:

        String userName = UsernameText.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system user account directory if you have the user
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        Enterprise inEnterprise = null;
        Organisation inOrganisation = null;
        BankAccount inBankAccount = null;
        if (userAccount == null) {
            //Step2: Go inside each network to check each enterprise
            for (Network network : system.getNetworkList()) {
                //Step 2-a: Check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        //Step3: Check against each organization inside that enterprise
                        for (Organisation organization : enterprise.getOrganisationDirectory().getOrganisationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                               
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganisation = organization;
                                break;
                            }
                        }
                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganisation != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }

        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentails!");
            return;
        } else {
            CardLayout layout = (CardLayout) leftContainer.getLayout();
            leftContainer.add("workArea", userAccount.getRole().createWorkArea(leftContainer,rightContainer, userAccount, inOrganisation, inEnterprise, system));
            layout.next(leftContainer);
        }
        BTNLogin.setEnabled(false);
        BTNLogout.setEnabled(true);
        UsernameText.setEnabled(false);
        passwordField.setEnabled(false);

//        SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= new SystemAdminWorkAreaJPanel(leftContainer,rightContainer, system);
//        leftContainer.add("systemAdminWorkAreaJPanel", systemAdminWorkAreaJPanel);
//        CardLayout layout = (CardLayout)leftContainer.getLayout();
//        layout.next(leftContainer);

    }//GEN-LAST:event_BTNLoginActionPerformed

    private void BTNLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLogoutActionPerformed
        // TODO add your handling code here:
        BTNLogout.setEnabled(false);
        UsernameText.setEnabled(true);
        passwordField.setEnabled(true);
        BTNLogin.setEnabled(true);

        UsernameText.setText("");
        passwordField.setText("");

        leftContainer.removeAll();
        JPanel blankJP = new JPanel();
        leftContainer.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) leftContainer.getLayout();
        crdLyt.next(leftContainer);
        
        rightContainer.removeAll();
        JPanel blankJ = new JPanel();
        rightContainer.add("blank", blankJ);
        CardLayout cardLayout = (CardLayout) rightContainer.getLayout();
        cardLayout.next(rightContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_BTNLogoutActionPerformed

    private void UsernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNLogin;
    private javax.swing.JButton BTNLogout;
    private javax.swing.JSplitPane SplitPane1;
    private javax.swing.JTextField UsernameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel leftContainer;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPanel rightContainer;
    // End of variables declaration//GEN-END:variables
}
