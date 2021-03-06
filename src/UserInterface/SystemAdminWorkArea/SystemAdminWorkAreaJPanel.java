/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import java.awt.CardLayout;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author manas
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EnterpriseAdmin
     */

    
    private Ecosystem system;
    private JPanel leftContainer;
//    private CardLayout cardLayout;
    private JPanel rightContainer;
       
    public SystemAdminWorkAreaJPanel(JPanel leftContainer, JPanel rightContainer, Ecosystem system) {
        initComponents();
        this.leftContainer = leftContainer;
        this.system = system;
        this.rightContainer = rightContainer;
        populateTree();
    }
    public void populateTree() {
        
        DefaultTreeModel model = (DefaultTreeModel) JTree3.getModel();

        
        
        ArrayList<Network> networkList = system.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organisation> organisationList;
        Network network;
        Enterprise enterprise;
        Organisation organization;

        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        for (int i = 0; i < networkList.size(); i++) {
            network = networkList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);

            enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();

            for (int j = 0; j < enterpriseList.size(); j++) {
                enterprise = enterpriseList.get(j);
                enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);

                organisationList = enterprise.getOrganisationDirectory().getOrganisationList();
                for (int k = 0; k < organisationList.size(); k++) {
                    organization = organisationList.get(k);
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }

        model.reload();
    }

    
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        JTree3 = new javax.swing.JTree();
        NtwrkBTN = new javax.swing.JButton();
        manageEnterpriseJButton = new javax.swing.JButton();
        manageAdminJButton = new javax.swing.JButton();
        btnBI = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("System");
        JTree3.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        JTree3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTree3.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                JTree3valueChangedAction(evt);
            }
        });
        jScrollPane4.setViewportView(JTree3);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 910));

        NtwrkBTN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NtwrkBTN.setText("Manage Network");
        NtwrkBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NtwrkBTNActionPerformed(evt);
            }
        });
        jPanel1.add(NtwrkBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 160, 40));

        manageEnterpriseJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        manageEnterpriseJButton.setText("Manage Enterprise");
        manageEnterpriseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(manageEnterpriseJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 160, 40));

        manageAdminJButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        manageAdminJButton.setText("Manage Enterprise Admin");
        manageAdminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAdminJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(manageAdminJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 160, 40));

        btnBI.setText("Business Intelligence");
        btnBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBIActionPerformed(evt);
            }
        });
        jPanel1.add(btnBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTree3valueChangedAction(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_JTree3valueChangedAction

    }//GEN-LAST:event_JTree3valueChangedAction

    private void manageEnterpriseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseJButtonActionPerformed

        ManageEnterpriseJPanel panel = new ManageEnterpriseJPanel(rightContainer, system);
        rightContainer.add("manageEnterpriseJPanel", panel);

        CardLayout layout = (CardLayout) rightContainer.getLayout();
        layout.next(rightContainer);
    }//GEN-LAST:event_manageEnterpriseJButtonActionPerformed

    private void manageAdminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAdminJButtonActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel = new ManageEnterpriseAdminJPanel(rightContainer, system);
        rightContainer.add("manageEnterpriseAdminJPanel", manageEnterpriseAdminJPanel);

        CardLayout layout = (CardLayout) rightContainer.getLayout();
        layout.next(rightContainer);
    }//GEN-LAST:event_manageAdminJButtonActionPerformed

    private void NtwrkBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NtwrkBTNActionPerformed
        // TODO add your handling code here:
        ManageNetworkJPanel MNpanel = new ManageNetworkJPanel(rightContainer, system);
        rightContainer.add("manageNetworkJPanel", MNpanel);
        CardLayout layout = (CardLayout) rightContainer.getLayout();
        layout.next(rightContainer);
    }//GEN-LAST:event_NtwrkBTNActionPerformed

    private void btnBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBIActionPerformed
        // TODO add your handling code here:
        BusinessIntelligenceJPanel panel = new BusinessIntelligenceJPanel(rightContainer, system);
        rightContainer.add("BusinessIntJPanel", panel);
        CardLayout layout = (CardLayout) rightContainer.getLayout();
        layout.next(rightContainer);
    }//GEN-LAST:event_btnBIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree JTree3;
    private javax.swing.JButton NtwrkBTN;
    private javax.swing.JButton btnBI;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton manageAdminJButton;
    private javax.swing.JButton manageEnterpriseJButton;
    // End of variables declaration//GEN-END:variables
}
