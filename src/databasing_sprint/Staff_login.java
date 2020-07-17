package databasing_sprint;

import static databasing_sprint.Database_work.DB_url;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Staff_login extends javax.swing.JFrame {

    Staff_login() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        tUsername.setToolTipText("JColeman");
        jPanel2.add(tUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 130, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Staff login");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 70, -1));

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 80, -1));

        tPassword.setToolTipText("123");
        jPanel2.add(tPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background1.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 900));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 900));
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 900));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-420, -40, 790, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Database_work dbBrain = new Database_work();
        Connection con;

        String username = tUsername.getText();
        String pswd = tPassword.getText();
        boolean exists = false;

        if (checkInputs(username, pswd)) {        //Check to see if the username exists and the password matches
            String qry = "Select * from mzamomtsha_registration.staff "
                    + "where Username = '" + username + "' and Password = '"
                    + pswd + "'";
            try {
                Class.forName(dbBrain.getjdbcDriver());
                con = DriverManager.getConnection(dbBrain.getDBurl(), dbBrain.getUsername(), dbBrain.getPassword());

                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(qry);

                if (rs.next()) {
                    saveStaff(rs.getInt("ID"), rs.getString("Name"),
                            rs.getString("Surname"), rs.getString("Subject"),
                            rs.getInt("Grade"), rs.getString("Username"),
                            rs.getString("Password"));

                    super.dispose();
                    new Staff_dashboard().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }
                rs.close();
                stmt.close();
                con.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Failed to connect to database");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Parent_login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please provide a valid username and password");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        super.dispose();
        new Welcome_page().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void saveStaff(int ID, String Name, String Sname, String Subject,
            int Grade, String Uname, String Password) {

        String parentInfo = String.valueOf(ID) + "," + Name + "," + Sname
                + "," + Subject + "," + String.valueOf(Grade) + ","
                + Uname + "," + Password;
        try {
            File tfile = new File("TemporaryInfoStorage.txt");
            FileWriter myWriter = new FileWriter(tfile);
            myWriter.write(parentInfo);
            myWriter.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to save parent information");
        }
    }

    public boolean checkInputs(String Uname, String pswd) {
        return (Uname != null && pswd != null);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField tPassword;
    private javax.swing.JTextField tUsername;
    // End of variables declaration//GEN-END:variables
}
