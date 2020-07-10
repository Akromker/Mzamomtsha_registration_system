package databasing_sprint;

import static databasing_sprint.Database_work.DB_url;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex
 */
public class Parent_dashboard extends javax.swing.JFrame {

    public Parent_dashboard() {
        initComponents();
        showParent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Your dashboard:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 210, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Children enrolled with us:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 370, 80));

        jButton1.setText("Log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background3.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(500, 900));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 900));
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 900));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 470, 340));

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
        //clear the textfile before signing out so that parent information is not
        //can only be accessed while that parent is signed in.
        clearParentInfo();        
        try {
            new Parent_login().setVisible(true);
            super.dispose();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Failed to display login page.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void showParent() {
        Connection con;
        Statement stmt;
        Database_work dbBrain= new Database_work();
        int id;
        
        try {
            id = readParentID();
            String myQuery = "Select * from mzamomtsha_registration.learner_details "
                    + " where Parent_ID = " + id ;
            
            Class.forName(dbBrain.getjdbcDriver());
            con = DriverManager.getConnection(dbBrain.getDBurl(), dbBrain.getUsername(), dbBrain.getPassword());
            
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(myQuery);
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            Object[] row = new Object[4];
            while(rs.next()){
                row[0] = rs.getInt("ID");
                row[1] = rs.getString("Name");
                row[2] = rs.getString("Surname");
                row[3] = rs.getInt("Grade");
                model.addRow(row);
            }            
            

        } catch (FileNotFoundException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Parent_dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int readParentID() throws FileNotFoundException {
        
        int ID = 0;
        
        File tFile = new File("TemporaryInfoStorage.txt");
        Scanner myReader = new Scanner(tFile);

        while (myReader.hasNextLine()) {
            String info = myReader.nextLine();
            String[] allInfo = info.split(",");
            ID = Integer.parseInt(allInfo[0]);
        }

        return ID;
    }
    
    public void clearParentInfo(){
        try {
            File tfile = new File("TemporaryInfoStorage.txt");
            FileWriter myWriter = new FileWriter(tfile);
            myWriter.write("");
            myWriter.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to save parent information");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
