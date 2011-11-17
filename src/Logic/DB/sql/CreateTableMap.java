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
public class CreateTableMap {
    
    public void createTableMap(){
        String query="";
        query+="CREATE TABLE mapsUser (id INT AUTO_INCREMENT PRIMARY KEY,";
	query+="userId INT NOT NULL,";
	query+="name VARCHAR(10) NOT NULL,";
        query+="isPublic INT NOT NULL DEFAULT 1,";
	query+="anzKarten int NOT NULL DEFAULT 1,";
        query+="schwierigkeit int NOT NULL DEFAULT 0,";
        query+="anzQuests int NOT NULL DEFAULT 0,";
        query+="anzBosse int NOT NULL DEFAULT 0,";
	query+="date DATE);";
        System.out.println(query);
        int result=Objekte.getDbInit().makeDbUpdate(query);
        System.out.println(result);
    }
    
}
