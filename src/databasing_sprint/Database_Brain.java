/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasing_sprint;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Database_Brain {

    static final String JDBC_Driver = "com.mysql.jdbc.Driver";
    static final String DB_url = "jdbc:mysql://localhost/mzamomtsha_registration?autoReconnect=true&useSSL=false";
    static final String userName = "root";
    static final String pswd = "root";
    private Connection con;

    public Database_Brain() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_url, userName, pswd);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "I failed to connect to the database");
        }
    }
//Constructor getters and connection closer
    public String getjdbcDriver() {
        return JDBC_Driver;
    }

    public String getDBurl() {
        return DB_url;
    }

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return pswd;
    }

    public void closeConnection() throws SQLException {
        try {
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed to close connection to database");
        }
    }
//Class Functions
    public boolean check_admin(String Uname, String Pswd) throws SQLException {
        String qry = "SELECT * FROM admin";
        String dbUname, dbPSWD;
        Statement stmt = null;

        try {

            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(qry);

            if (rs == null) {
                JOptionPane.showMessageDialog(null, "Your resultset returned null");
            }
            while (rs.next()) {
                dbUname = rs.getString("Username");
                dbPSWD = rs.getString("Password");

                if (dbUname.equals(Uname) && dbPSWD.equals(Pswd)) {
                    stmt.close();
                    return true;
                }
            }
            stmt.close();
            rs.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Could not establish connection to database");
        }

        return false;
    }

    public boolean checkParentIDexists(int ID) {
        String qry = "SELECT ID FROM mzamomtsha_registration.parents "
                + " WHERE ID = " + ID;
        try {
            Statement stmt = con.createStatement();
            stmt.executeQuery(qry);
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    public void executeUpdateQuery(String qry) throws ClassNotFoundException {
        Statement stmt;
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(qry);
            stmt.close();

            JOptionPane.showMessageDialog(null, "Successfully updated database");
        } catch (SQLException ex) {
            Logger.getLogger(Database_Brain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List getParentRecord(String hint) throws ClassNotFoundException {
        Statement stmt;
        String qry, name, Sname, Uname, PSWD, Contact, Address, resultAddition, ID;
        List<String> searchResults = new ArrayList<>();

        try {
            qry = "Select * FROM parents";

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_url, userName, pswd);

            stmt = con.createStatement();
            ResultSet results = stmt.executeQuery(qry);

            while (results.next()) {
                ID = String.valueOf(results.getInt("ID"));
                name = results.getString("Name");
                Sname = results.getString("Surname");
                Uname = results.getString("Username");
                PSWD = results.getString("Password");
                Contact = results.getString("Contact");
                Address = results.getString("Address");

                if (((ID).equals(hint)) || (name.equals(hint)) || (Sname.equals(hint))
                        || (Uname.equals(hint)) || (PSWD.equals(hint))
                        || (Contact.equals(hint)) || (Address.equals(hint))) {

                    resultAddition = "ID: " + ID + ", "
                            + "Name: " + name + ", "
                            + "Surname: " + Sname + ", "
                            + "Username: " + Uname + ", "
                            + "Password: " + PSWD + ", "
                            + "Contact: " + Contact + ", "
                            + "Address: " + Address + "\n";
                    searchResults.add(resultAddition);
                }
            }
            stmt.close();
            results.close();
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Failed to execute query");

        }
        return searchResults;
    }

}
