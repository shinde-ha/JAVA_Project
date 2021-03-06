/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.ModeratorOrganisation;
import Business.Organisation.Organisation;
import Business.WorkQueue.ModeratorRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Harsh $hinde
 */
public class TopBorrowerRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TopBorrowerRequestJPanel
     */
    
    private JPanel rightContainer;
    private Ecosystem system;
    private Organisation o;
    
    

    public TopBorrowerRequestJPanel(JPanel rightContainer, Ecosystem system) {
        initComponents();
        this.rightContainer=rightContainer;
        this.system=system;
        
        populateCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void populateCombo(){
        for(Network net:system.getNetworkList()){
            jComboBox1.addItem(net);
        }
    }
    
      public void populateTable(){
        
 
        Network network = (Network) jComboBox1.getSelectedItem();
        
        for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
            for(Organisation o: enterprise.getOrganisationDirectory().getOrganisationList()){
                if(o instanceof ModeratorOrganisation){
                    if (o!=null){
                                    String maxBorr = null;
                                    float maxLoanAmount = 0;
                                        for (WorkRequest request : o.getWorkQueue().getWorkRequestList()){
                                            if(request instanceof ModeratorRequest){
                                                float amt = ((ModeratorRequest) request).getLoanAmount();
                                                    if(amt>maxLoanAmount){
                                                            maxLoanAmount = amt;
                                                            maxBorr = ((ModeratorRequest) request).getSender().toString();

                                                    }

                                            }
                                        }
            DefaultTableModel model = (DefaultTableModel) tblLender.getModel();

            model.setRowCount(0);
            Object row[] = new Object[2];
            row[0]= maxBorr == null ? "No Lender Name Yet" :maxBorr;
            row[1]= maxLoanAmount == 0 ? "No Amount Donated Yet" :maxLoanAmount;
            
            model.addRow(row);
           // break;
        }
        
        }
        }
        }
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBarGraph = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLender = new javax.swing.JTable();

        btnBarGraph.setText("Bar Graph");
        btnBarGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarGraphActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Network:");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        tblLender.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Borrower Name", "Funds Requested"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLender);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel1)
                        .addGap(101, 101, 101)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBarGraph, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnBarGraph)
                .addGap(80, 80, 80)
                .addComponent(btnBack)
                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBarGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarGraphActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        int i = 1;
        Network network = (Network) jComboBox1.getSelectedItem();
        for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
            for(Organisation o: enterprise.getOrganisationDirectory().getOrganisationList()){
                if(o instanceof ModeratorOrganisation){
                    for(WorkRequest request : o.getWorkQueue().getWorkRequestList()){

                        dataSet.setValue(((ModeratorRequest) request).getLoanAmount(), "Funds Requested by borrower", ((ModeratorRequest) request).getSender().toString());

                        i++;

                    }
                }
            }
        }

        JFreeChart chart = ChartFactory.createBarChart3D("Borrower Request Graph","Borrower Name","Amount", dataSet, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLACK);
        ChartFrame frame = new ChartFrame("Bar Chart for Borrower Request",chart);
        frame.setVisible(true);
        frame.setSize(800, 550);
    }//GEN-LAST:event_btnBarGraphActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightContainer.remove(this);
        CardLayout layout = (CardLayout) rightContainer.getLayout();
        layout.previous(rightContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBarGraph;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLender;
    // End of variables declaration//GEN-END:variables
}
