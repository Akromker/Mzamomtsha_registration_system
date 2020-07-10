package databasing_sprint;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Admin_addRecord extends javax.swing.JFrame {

    public Admin_addRecord() {
        initComponents();
        jRadioButton1.setSelected(true);

        jSpinner2.setEnabled(false);
        jSpinner3.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Table_select = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tSname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tNum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tUname = new javax.swing.JTextField();
        tPSWD = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        jPanel2.add(tName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 130, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Add new record");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Surname:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        jPanel2.add(tSname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 130, 30));

        jButton1.setText("Add record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 100, -1));

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 100, -1));
        jPanel2.add(tNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact number:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 160, -1));
        jPanel2.add(tAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 130, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));
        jPanel2.add(tUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 130, 30));
        jPanel2.add(tPSWD, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 130, 30));

        jRadioButton2.setBackground(new java.awt.Color(51, 51, 51));
        Table_select.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Student");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));

        jRadioButton1.setBackground(new java.awt.Color(51, 51, 51));
        Table_select.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("parent");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Grade:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel2.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 50, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Parent ID");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 90, -1));

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 7, 1));
        jPanel2.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background2.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 900));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 900));
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 900));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //initialize all variables
        Database_work dbBrain = new Database_work();
        String name, surname, contactNum, address,
                Uname, Pswd;
        int grade, parentID;

        name = tName.getText();
        surname = tSname.getText();
        contactNum = tNum.getText();
        address = tAddress.getText();
        Uname = tUname.getText();
        Pswd = tPSWD.getText();
        grade = (int) jSpinner2.getValue();
        parentID = (int) jSpinner3.getValue();

        String qry;

        if (dbBrain.checkParentIDexists(parentID)) {
            if (jRadioButton1.isSelected()) {
                //create query string
                try {
                    qry = "INSERT INTO mzamomtsha_registration.parents (Name, Surname, Username,"
                            + "Password, Contact, Address) "
                            + "VALUES ('" + name + "', '" + surname + "', '" + Uname + "', '"
                            + Pswd + "', '" + contactNum + "', '" + address + "')";

                    dbBrain.executeUpdateQuery(qry);
                    clearTextFields();
                    dbBrain.closeConnection();
                } catch (ClassNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "Cannot find addRecord function");
                } catch (SQLException ex) {
                    Logger.getLogger(Admin_addRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                //create query string
                try {
                    qry = "INSERT INTO mzamomtsha_registration.learner_details "
                            + "(Name, Surname, Grade, Parent_ID) VALUES ('" + name
                            + "', '" + surname + "', '" + grade + "', '" + parentID
                            + "')";

                    dbBrain.executeUpdateQuery(qry);
                    clearTextFields();
                    dbBrain.closeConnection();
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Failed to add record");
                } catch (SQLException ex) {
                    Logger.getLogger(Admin_addRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Your ID does not exist.");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        super.dispose();
        new Admin_dashboard().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        tNum.setEnabled(true);
        tNum.setBackground(Color.white);

        tAddress.setEnabled(true);
        tAddress.setBackground(Color.white);

        tUname.setEnabled(true);
        tUname.setBackground(Color.white);

        tPSWD.setEnabled(true);
        tPSWD.setBackground(Color.white);

        jSpinner2.setEnabled(false);
        jSpinner3.setEnabled(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        tNum.setEnabled(false);
        tNum.setText("");
        tNum.setBackground(Color.darkGray);

        tAddress.setEnabled(false);
        tAddress.setText("");
        tAddress.setBackground(Color.darkGray);

        tUname.setEnabled(false);
        tUname.setText("");
        tUname.setBackground(Color.darkGray);

        tPSWD.setEnabled(false);
        tPSWD.setText("");
        tPSWD.setBackground(Color.darkGray);

        jSpinner2.setEnabled(true);
        jSpinner3.setEnabled(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void clearTextFields() {
        tName.setText("");
        tSname.setText("");
        tNum.setText("");
        tAddress.setText("");
        tUname.setText("");
        tPSWD.setText("");

        jSpinner2.setValue(1);

        jSpinner3.setValue(1);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Table_select;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextField tAddress;
    private javax.swing.JTextField tName;
    private javax.swing.JTextField tNum;
    private javax.swing.JTextField tPSWD;
    private javax.swing.JTextField tSname;
    private javax.swing.JTextField tUname;
    // End of variables declaration//GEN-END:variables

}
