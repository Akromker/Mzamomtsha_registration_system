package databasing_sprint;

import static databasing_sprint.Database_work.DB_url;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex
 */
public class Admin_searchRecord extends javax.swing.JFrame {

    public Admin_searchRecord() {
        initComponents();
        showParents();
        showPupils();
        showStaff();
        showAdmins();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("All available tables:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 130, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Contact", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 370, 100));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Parents:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Grade", "ParentID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 370, 100));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pupils:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Subject", "Grade", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 390, 100));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Staff:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Subject", "Grade", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 390, 100));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Admins:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background2.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 900));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 900));
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 900));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 430));

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
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        super.dispose();
        new Admin_dashboard().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void showParents() {
        Connection con;
        Statement stmt;
        Database_work dbBrain= new Database_work();
        
        int id;
        try {
            String myQuery = "Select * from mzamomtsha_registration.parents";

            Class.forName(dbBrain.getjdbcDriver());
            con = DriverManager.getConnection(dbBrain.getDBurl(), dbBrain.getUsername(), dbBrain.getPassword());

            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(myQuery);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            Object[] row = new Object[5];
            while (rs.next()) {
                row[0] = rs.getInt("ID");
                row[1] = rs.getString("Name");
                row[2] = rs.getString("Surname");
                row[3] = rs.getString("Contact");
                row[4] = rs.getString("Address");
                model.addRow(row);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Parent_dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showPupils() {
        Connection con;
        Statement stmt;
        Database_work dbBrain= new Database_work();
        int id;
        
        try {
            String myQuery = "Select * from mzamomtsha_registration.learner_details";

            Class.forName(dbBrain.getjdbcDriver());
            con = DriverManager.getConnection(dbBrain.getDBurl(), dbBrain.getUsername(), dbBrain.getPassword());

            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(myQuery);

            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            Object[] row = new Object[5];
            while (rs.next()) {
                row[0] = rs.getInt("ID");
                row[1] = rs.getString("Name");
                row[2] = rs.getString("Surname");
                row[3] = rs.getInt("Grade");
                row[4] = rs.getInt("Parent_ID");
                model.addRow(row);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Parent_dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void showStaff(){
        Connection con;
        Statement stmt;
        Database_work dbBrain= new Database_work();
        int id;
        
        try {
            String myQuery = "Select * from mzamomtsha_registration.staff";

            Class.forName(dbBrain.getjdbcDriver());
            con = DriverManager.getConnection(dbBrain.getDBurl(), dbBrain.getUsername(), dbBrain.getPassword());

            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(myQuery);

            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            Object[] row = new Object[7];
            while (rs.next()) {
                row[0] = rs.getInt("ID");
                row[1] = rs.getString("Name");
                row[2] = rs.getString("Surname");
                row[3] = rs.getString("Subject");
                row[4] = rs.getInt("Grade");
                row[5] = rs.getString("Username");
                row[6] = rs.getString("Password");
                model.addRow(row);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Parent_dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showAdmins(){
        Connection con;
        Statement stmt;
        Database_work dbBrain= new Database_work();
        int id;
        
        try {
            String myQuery = "Select * from mzamomtsha_registration.admin";

            Class.forName(dbBrain.getjdbcDriver());
            con = DriverManager.getConnection(dbBrain.getDBurl(), dbBrain.getUsername(), dbBrain.getPassword());
            
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(myQuery);

            DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
            Object[] row = new Object[5];
            while (rs.next()) {
                row[0] = rs.getInt("ID");
                row[1] = rs.getString("Name");
                row[2] = rs.getString("Surname");
                row[3] = rs.getString("Username");
                row[4] = rs.getString("Password");
                model.addRow(row);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Parent_dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}
