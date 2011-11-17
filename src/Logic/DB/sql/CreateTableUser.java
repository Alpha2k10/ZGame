/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic.DB.sql;

import Logic.Objekte;
import java.sql.ResultSet;

/**
 *
 * @author Alex
 */
public class CreateTableUser {
    
    public CreateTableUser(){
        
    }

    public void createTableUser(){
        String query="";
        query+="CREATE TABLE user (id INT AUTO_INCREMENT PRIMARY KEY,";
	query+="name VARCHAR(20) NOT NULL,";
	query+="pw VARCHAR(10) NOT NULL,";
	query+="email VARCHAR(30) NOT NULL UNIQUE,";
	query+="date DATE);";
        System.out.println(query);
        int result=Objekte.getDbInit().makeDbUpdate(query);
        System.out.println(result);
    }
}
