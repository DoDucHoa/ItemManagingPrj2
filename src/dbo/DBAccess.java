package dbo;

import java.sql.*;
import javax.swing.JOptionPane;

public class DBAccess {
    Connection con = null;
    Statement stmt = null;
    public DBAccess(){}
    public void connectDB(String driver, String url){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ResultSet executeQuery(String selectSql){
        if(con == null) 
            return null;
        try {
            return (stmt.executeQuery(selectSql));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    public int executeUpdate(String updatedSql){
        if(con == null)
            return 0;
        try {
            return (stmt.executeUpdate(updatedSql));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }
}
