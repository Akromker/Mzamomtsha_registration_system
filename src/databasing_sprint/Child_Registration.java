package databasing_sprint;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Child_Registration extends javax.swing.JFrame {

    private File Citizenship = null;
    private File Document = null;
    private File ExtraDoc = null;

    public Child_Registration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        JLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        JLable2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        tName = new javax.swing.JTextField();
        JLabel4 = new javax.swing.JLabel();
        tSname = new javax.swing.JTextField();
        JLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        JLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        vGrade = new javax.swing.JSpinner();
        jButton6 = new javax.swing.JButton();
        JLable3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLabel1.setForeground(new java.awt.Color(255, 255, 255));
        JLabel1.setText("Guardian Citizenship:");
        jPanel1.add(JLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jButton4.setText("Upload file");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 130, -1));

        JLable2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLable2.setForeground(new java.awt.Color(255, 255, 255));
        JLable2.setText("Guardian Document:");
        jPanel1.add(JLable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jButton5.setText("Upload file");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 130, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Pupil registration");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        JLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLabel3.setForeground(new java.awt.Color(255, 255, 255));
        JLabel3.setText("Name:");
        jPanel1.add(JLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 70, 30));

        tName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNameActionPerformed(evt);
            }
        });
        jPanel1.add(tName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 130, 30));

        JLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLabel4.setForeground(new java.awt.Color(255, 255, 255));
        JLabel4.setText("Surname:");
        jPanel1.add(JLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 30));
        jPanel1.add(tSname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 130, 30));

        JLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLabel5.setForeground(new java.awt.Color(255, 255, 255));
        JLabel5.setText("Gender");
        jPanel1.add(JLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 100, 30));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        JLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLabel6.setForeground(new java.awt.Color(255, 255, 255));
        JLabel6.setText("Grade:");
        jPanel1.add(JLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 30));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 110, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 110, -1));

        vGrade.setModel(new javax.swing.SpinnerNumberModel(1, 1, 7, 1));
        jPanel1.add(vGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 50, -1));

        jButton6.setText("Upload file");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 130, -1));

        JLable3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLable3.setForeground(new java.awt.Color(255, 255, 255));
        JLable3.setText("Extra documents:");
        jPanel1.add(JLable3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BlackBoard.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-460, -110, 1020, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new Parent_dashboard().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNameActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String qry;
        Database_work dbBrain = new Database_work();

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        if (chooser.getSelectedFile() != null) {
            Document = chooser.getSelectedFile();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String qry;
        Database_work dbBrain = new Database_work();

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        if (chooser.getSelectedFile() != null) {
            Citizenship = chooser.getSelectedFile();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Name, Surname, Gender, textFileInfo;
        String[] parentInfo;
        int Grade, Parent_ID = 0;
        Database_work dbBrain = new Database_work();

        if (CheckNull()) {
            //Getting parent ID;
            try {
                File Tfile = new File("TemporaryInfoStorage.txt");
                Scanner myReader = new Scanner(Tfile);

                if (myReader.hasNextLine()) {
                    textFileInfo = myReader.nextLine();
                    parentInfo = textFileInfo.split(",");

                    Parent_ID = Integer.parseInt(parentInfo[0]);
                }
                myReader.close();

            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Failed to obtain parent ID");
            }
            //Name, surname, grade and gender
            Name = tName.getText();
            Surname = tSname.getText();
            if (jRadioButton1.isSelected()) {
                Gender = "Male";
            } else {
                Gender = "Female";
            }

            Grade = (int) vGrade.getValue();

            //Add info to database
            try {
                String qry = "INSERT INTO learner_details "
                        + "(Name, Surname, Grade, Gender, GaurdianDoc, Gaurdian_Citizenship, "
                        + "Parent_ID, Extra_file)  VALUES ('" + Name + "', '" + Surname + "', '"
                        + Grade + "', '" + Gender + "', '" + Document + "', '" + Citizenship
                        + "', '" + Parent_ID + "', '" + ExtraDoc + "')";

                dbBrain.executeUpdateQuery(qry);
                dbBrain.closeConnection();

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Faled to update database");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String qry;
        Database_work dbBrain = new Database_work();

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        if (chooser.getSelectedFile() != null) {
            ExtraDoc = chooser.getSelectedFile();
        }
    }//GEN-LAST:event_jButton6ActionPerformed
    public boolean CheckNull() {
        //returns true if all fields are fine

        if (Citizenship == null) {
            JOptionPane.showMessageDialog(null, "Please provide a proof of citizenship");
            return false;
        }
        if (Document == null) {
            JOptionPane.showMessageDialog(null, "Please provide Guardian documentation");
            return false;
        }
        if (tName.getText() != null && tSname.getText() != null
                && Citizenship != null && Document != null && ExtraDoc != null) {
            JOptionPane.showMessageDialog(null, "Please fill in all the necessary fields");
            return true;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JLabel JLabel4;
    private javax.swing.JLabel JLabel5;
    private javax.swing.JLabel JLabel6;
    private javax.swing.JLabel JLable2;
    private javax.swing.JLabel JLable3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField tName;
    private javax.swing.JTextField tSname;
    private javax.swing.JSpinner vGrade;
    // End of variables declaration//GEN-END:variables
}
