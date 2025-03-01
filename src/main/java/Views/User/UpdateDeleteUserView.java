/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views.User;

import Model.DB_CONNECTION;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author fsd
 */
public class UpdateDeleteUserView extends javax.swing.JFrame {

    /**
     * Creates new form AddUserFrame
     */
    public UpdateDeleteUserView() {
        initComponents();
    }
        public void form_update() {
         String StrSearchUpdateDeleteMedicine = SearchUserNameInput.getText();
        if (StrSearchUpdateDeleteMedicine.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter User Name");
        } else {
            try {
                DB_CONNECTION db = new DB_CONNECTION();
                String Query = "select * from users where name like ?";
                db.Pstmt = db.Con.prepareStatement(Query);
                db.Pstmt.setString(1, SearchUserNameInput.getText() + "%");
                db.Rst = db.Pstmt.executeQuery();

                if (db.Rst.isBeforeFirst()) {
                    while (db.Rst.next()) {
                        usernameinput.setText(db.Rst.getString(2));
                        useremailinput.setText(db.Rst.getString(3));
                        userpasswordinput.setText(db.Rst.getString(4));   
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "User Not Found! Please Enter correct User Name");
                }

            } catch (HeadlessException | SQLException e) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameinput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        useremailinput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        userpasswordinput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        userroleinput = new javax.swing.JComboBox<>();
        DeleteBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        SearchUserNameInput = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel1.setText("Update / Delete User");

        jLabel2.setText("User Name");

        jLabel3.setText("User E-mail");

        jLabel4.setText("User Password");

        jLabel5.setText("User Role");

        UpdateBtn.setBackground(new java.awt.Color(0, 153, 0));
        UpdateBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("Update User");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        ResetBtn.setBackground(new java.awt.Color(0, 153, 0));
        ResetBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(255, 255, 255));
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        userroleinput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User Role", "Admin", "SalesPerson", "Manager" }));

        DeleteBtn.setBackground(new java.awt.Color(0, 153, 0));
        DeleteBtn.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete User");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(usernameinput, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(userpasswordinput, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(132, 132, 132)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(useremailinput)
                                .addComponent(userroleinput, 0, 285, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(UpdateBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                            .addComponent(DeleteBtn)
                            .addGap(141, 141, 141)
                            .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SearchUserNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchBtn)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(SearchUserNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameinput, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(useremailinput))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userpasswordinput, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(userroleinput))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        form_update();
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        String sname = SearchUserNameInput.getText();
        String Name = usernameinput.getText(), UserEmail = useremailinput.getText(), UserPassword = userpasswordinput.getText(), Role = (String) userroleinput.getSelectedItem();
        if ("User Role".equals(Role) || UserEmail.trim().isEmpty() || UserPassword.trim().isEmpty() || Name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Fill And Select All The Required Fields");
        } else {
            try {
                DB_CONNECTION db = new DB_CONNECTION();
                 String Query = "select * from users where name like ?";
                 db.Pstmt = db.Con.prepareStatement(Query);
                 db.Pstmt.setString(1, sname + "%");
                 db.Rst = db.Pstmt.executeQuery();
                 if (db.Rst.next()) {
                System.out.println("User found!"); // Debugging output
                String uname = db.Rst.getString("user_id");
                System.out.println(uname);
                String InsertQuery = "update users set name=?, email=?, password=?, role=? where user_id=?";
                db.Pstmt = db.Con.prepareStatement(InsertQuery);
                    db.Pstmt.setString(1, Name);
                    db.Pstmt.setString(2, UserEmail);
                    db.Pstmt.setString(3, UserPassword);
                    db.Pstmt.setString(4, Role);
                    db.Pstmt.setString(5, uname);
                int i = db.Pstmt.executeUpdate();
                if (i > 0) {
                     usernameinput.setText("");
                     useremailinput.setText("");
                     userpasswordinput.setText("");
                     SearchUserNameInput.setText("");
                    JOptionPane.showMessageDialog(this, "User Successfully Updated");
                } else {
                    JOptionPane.showMessageDialog(this, "Error In Update User");
                }
                 }
            } catch (HeadlessException | SQLException e) {
            }
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        String Uname = SearchUserNameInput.getText();
        try {
            DB_CONNECTION db = new DB_CONNECTION();
            int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to Delete This User","Warning",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
            String InsertQuery = "delete from users where name like ?";
            db.Pstmt = db.Con.prepareStatement(InsertQuery);
             db.Pstmt.setString(1, Uname + "%");
            int i = db.Pstmt.executeUpdate();
           
            if (i > 0) {
                 usernameinput.setText("");
                     useremailinput.setText("");
                     userpasswordinput.setText("");
                     SearchUserNameInput.setText("");
                JOptionPane.showMessageDialog(this, "User Successfully Deleted");
                
            } else {
                JOptionPane.showMessageDialog(this, "Error In Deletion User");
            }
            }
        } catch (HeadlessException | SQLException e) {
        }

    }//GEN-LAST:event_DeleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateDeleteUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UpdateDeleteUserView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SearchUserNameInput;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField useremailinput;
    private javax.swing.JTextField usernameinput;
    private javax.swing.JTextField userpasswordinput;
    private javax.swing.JComboBox<String> userroleinput;
    // End of variables declaration//GEN-END:variables
}
