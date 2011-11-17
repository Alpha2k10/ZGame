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
public class CreateTableMapObjekt {
    
    public void createTableMapObjekte(){
        String query="";
        query+="CREATE TABLE mapObjekte (id INT AUTO_INCREMENT PRIMARY KEY,";
	query+="mapNumberId INT NOT NULL,";
	query+="x INT NOT NULL,";
        query+="y INT NOT NULL,";
        query+="ground INT NOT NULL,";
        query+="groundEnv INT DEFAULT 0,";
	query+="objekt INT DEFAULT 0);";
        System.out.println(query);
        int result=Objekte.getDbInit().makeDbUpdate(query);
        System.out.println(result);
    }
    
}
