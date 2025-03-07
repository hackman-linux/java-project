/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views.Stock;

import Model.DB_CONNECTION;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fsd
 */
public class SalesFrame extends javax.swing.JFrame {

    /**
     * Creates new form Sales
     */
    public SalesFrame() {
        initComponents();
        update_table();
    }
    
     public void update_table(){
          try {
            DB_CONNECTION db = new DB_CONNECTION();
            String Query = "select * from sales";
            db.Pstmt = db.Con.prepareStatement(Query);
            db.Rst = db.Pstmt.executeQuery();
            if (db.Rst.isBeforeFirst()) {
                Vector<String> header = new Vector<>();
                Vector<Vector<String>> data = new Vector<>();
                header.add("No");
                header.add("Quantity");
                header.add("Date Sold");
                header.add("Total Price");
               
                int count = 1;
                while (db.Rst.next()) {
                    Vector<String> temp = new Vector<>();
                    temp.add(String.valueOf(count++));
                    temp.add(db.Rst.getString(2));
                    temp.add(db.Rst.getString(3));
                    temp.add(db.Rst.getString(4));
                    data.add(temp);
                }
                SaleTable.setModel(new DefaultTableModel(data, header));
            } else {
               Vector<String> header = new Vector<>();
                Vector<Vector<String>> data = new Vector<>();
                header.add("No");
                header.add("Quantity");
                header.add("Date Sold");
                header.add("Total Price");
               
                int count = 1;
                while (db.Rst.next()) {
                    Vector<String> temp = new Vector<>();
                    temp.add(String.valueOf(count++));
                    temp.add(db.Rst.getString(2));
                    temp.add(db.Rst.getString(3));
                    temp.add(db.Rst.getString(4));
                    data.add(temp);
                }
                SaleTable.setModel(new DefaultTableModel(data, header));
                JOptionPane.showMessageDialog(this, "Now There Is No Sales");
            }

        } catch (HeadlessException | SQLException e) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        qtysoldinput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        salepriceinput = new javax.swing.JTextField();
        addsalebtn = new javax.swing.JButton();
        updatesalebtn = new javax.swing.JButton();
        deletesalebtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SaleTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel1.setText("Sales View");

        jLabel2.setText("Quantity Sold");

        jLabel4.setText("Total Price");

        addsalebtn.setBackground(new java.awt.Color(0, 0, 0));
        addsalebtn.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        addsalebtn.setForeground(new java.awt.Color(255, 255, 255));
        addsalebtn.setText("Add Sale");
        addsalebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsalebtnActionPerformed(evt);
            }
        });

        updatesalebtn.setBackground(new java.awt.Color(0, 0, 0));
        updatesalebtn.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        updatesalebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatesalebtn.setText("Update Sale");
        updatesalebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatesalebtnActionPerformed(evt);
            }
        });

        deletesalebtn.setBackground(new java.awt.Color(0, 0, 0));
        deletesalebtn.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        deletesalebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletesalebtn.setText("Delete Sale");
        deletesalebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletesalebtnActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(0, 0, 0));
        resetbtn.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        SaleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        SaleTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaleTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SaleTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(387, 387, 387))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(qtysoldinput)
                    .addComponent(jLabel4)
                    .addComponent(salepriceinput)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addsalebtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(updatesalebtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deletesalebtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetbtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtysoldinput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salepriceinput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addsalebtn)
                            .addComponent(updatesalebtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deletesalebtn)
                            .addComponent(resetbtn))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addsalebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsalebtnActionPerformed
        // TODO add your handling code here:
         String Qty = qtysoldinput.getText(),  Price = salepriceinput.getText();
        if (Price.trim().isEmpty() || Qty.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Fill And Select All The Required Fields");
        } else {
            try {
                DB_CONNECTION db = new DB_CONNECTION();
                String InsertQuery = "insert into sales(quantitysold, totalprice) values(?, ?)";
                    db.Pstmt = db.Con.prepareStatement(InsertQuery);
                    db.Pstmt.setString(1, Qty);
                    db.Pstmt.setString(2, Price);
                    
                    int i = db.Pstmt.executeUpdate();
                    if (i > 0) {
                        JOptionPane.showMessageDialog(this, "Sales Successfully Added");
                        qtysoldinput.setText("");
                        salepriceinput.setText(""); 
                        
                    } else {
                        JOptionPane.showMessageDialog(this, "Error In Add New Sales");
                    }
                

            } catch (HeadlessException | SQLException e) {
            }
        }
    }//GEN-LAST:event_addsalebtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
         qtysoldinput.setText("");
         salepriceinput.setText(""); 
    }//GEN-LAST:event_resetbtnActionPerformed

    private void deletesalebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletesalebtnActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) SaleTable.getModel();
          int selectedIndex = SaleTable.getSelectedRow();
            try {   
                 DB_CONNECTION db = new DB_CONNECTION();
             String name = model.getValueAt(selectedIndex, 2).toString();
            int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to Delete the sales","Warning",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
            String Query = "delete from sales where date=?";
            db.Pstmt = db.Con.prepareStatement(Query);
            db.Pstmt.setString(1, name);
            int i = db.Pstmt.executeUpdate();
            if (i > 0) {
                update_table();
                JOptionPane.showMessageDialog(this, "Sales Has Been Deleted Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Error In Sales Deletion");
            }
            }
            } catch (SQLException ex) {  

        }  
    }//GEN-LAST:event_deletesalebtnActionPerformed

    private void SaleTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaleTableMouseClicked
        // TODO add your handling code here:
             DefaultTableModel DFT = (DefaultTableModel) SaleTable.getModel();
         int selectedRow =  SaleTable.getSelectedRow();
         qtysoldinput.setText(DFT.getValueAt(selectedRow, 1).toString());
         salepriceinput.setText(DFT.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_SaleTableMouseClicked

    private void updatesalebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatesalebtnActionPerformed
        // TODO add your handling code here:
        String Qty = qtysoldinput.getText(),  Price = salepriceinput.getText();
          DefaultTableModel model = (DefaultTableModel) SaleTable.getModel();
          int selectedIndex = SaleTable.getSelectedRow();
            try {   
                 DB_CONNECTION db = new DB_CONNECTION();
             String name = model.getValueAt(selectedIndex, 2).toString();
            int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to Upadte this Sales","Warning",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
            String Query = "update sales set quantitysold=?, totalprice=? where date=?";
            db.Pstmt = db.Con.prepareStatement(Query);
            db.Pstmt.setString(1, Qty);
            db.Pstmt.setString(2, Price);
            db.Pstmt.setString(3, name);
            int i = db.Pstmt.executeUpdate();
            if (i > 0) {
                update_table();
                JOptionPane.showMessageDialog(this, "Sales Has Been Updated Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Error In Sales Updation");
            }
            }
            } catch (SQLException ex) {  
        
        }  
    }//GEN-LAST:event_updatesalebtnActionPerformed

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
            java.util.logging.Logger.getLogger(SalesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SaleTable;
    private javax.swing.JButton addsalebtn;
    private javax.swing.JButton deletesalebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField qtysoldinput;
    private javax.swing.JButton resetbtn;
    private javax.swing.JTextField salepriceinput;
    private javax.swing.JButton updatesalebtn;
    // End of variables declaration//GEN-END:variables
}
