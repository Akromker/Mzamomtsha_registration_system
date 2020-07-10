package databasing_sprint;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class Admin_deleteRecord extends javax.swing.JFrame {

    public Admin_deleteRecord() {
        initComponents();
        rbParent.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rbParent = new javax.swing.JRadioButton();
        rbStaff = new javax.swing.JRadioButton();
        rbStudent = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Record ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 130, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Delete Record");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jButton1.setText("Remove record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 130, -1));

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 130, -1));

        rbParent.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(rbParent);
        rbParent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbParent.setForeground(new java.awt.Color(255, 255, 255));
        rbParent.setText("parent");
        rbParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbParentActionPerformed(evt);
            }
        });
        jPanel2.add(rbParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        rbStaff.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(rbStaff);
        rbStaff.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbStaff.setForeground(new java.awt.Color(255, 255, 255));
        rbStaff.setText("Staff");
        rbStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbStaffActionPerformed(evt);
            }
        });
        jPanel2.add(rbStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        rbStudent.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(rbStudent);
        rbStudent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbStudent.setForeground(new java.awt.Color(255, 255, 255));
        rbStudent.setText("Student");
        rbStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbStudentActionPerformed(evt);
            }
        });
        jPanel2.add(rbStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background2.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 900));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 900));
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 900));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, -30, 850, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int ID = Integer.parseInt(jTextField1.getText());
        Database_work dbBrain = new Database_work();
        if (rbParent.isSelected()) {
            try {
                dbBrain.deleteRecord("parent", ID);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Admin_deleteRecord.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (rbStudent.isSelected()) {
            try {
                dbBrain.deleteRecord("students", ID);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Admin_deleteRecord.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (rbStaff.isSelected()) {
            try {
                dbBrain.deleteRecord("staff", ID);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Admin_deleteRecord.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        super.dispose();
        new Admin_dashboard().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    private void rbParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbParentActionPerformed

    }//GEN-LAST:event_rbParentActionPerformed
    private void rbStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbStaffActionPerformed

    }//GEN-LAST:event_rbStaffActionPerformed

    private void rbStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbStudentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rbParent;
    private javax.swing.JRadioButton rbStaff;
    private javax.swing.JRadioButton rbStudent;
    // End of variables declaration//GEN-END:variables
}
