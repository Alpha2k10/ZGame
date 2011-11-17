/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic.DB;

import Gui.Haupt;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class InitDB {
    
    private Connection connection;
    private Statement statement;
    
    public InitDB(){
        
    }
    
    public void connectDB(){
        try {
            String url = "jdbc:mysql://localhost/game";
            connection = DriverManager.getConnection(url,"root","1234");
            statement= connection.createStatement();
            
        } catch (SQLException ex) {
            Logger.getLogger(InitDB.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public ResultSet makeDbQuery(String query){
        try {
            ResultSet result = this.statement.executeQuery(query);
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(InitDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int makeDbUpdate(String query){
        try {
            int result = this.statement.executeUpdate(query);
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(InitDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
