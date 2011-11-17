/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Logic.DB.sql;

import Logic.Objekte;

/**
 *
 * @author Alex
 */
public class CreateTableMapNumber {
    public void createTableMapNumber(){
        String query="";
        query+="CREATE TABLE mapNumber (id INT AUTO_INCREMENT PRIMARY KEY,";
	query+="mapId INT NOT NULL,";
	query+="name VARCHAR(10) NOT NULL,";
        query+="number INT NOT NULL DEFAULT 1,";
	query+="date DATE);";
        System.out.println(query);
        int result=Objekte.getDbInit().makeDbUpdate(query);
        System.out.println(result);
    }
}
