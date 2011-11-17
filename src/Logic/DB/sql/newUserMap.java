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
public class newUserMap {
    
    public void newUserMap(int userId,String name){
        String query="";
        query+="INSERT INTO mapsUser (userId,name) VALUES (";
        query+=""+userId+",";
        query+="'"+name+"');";
        System.out.println(query);
        int result = Objekte.getDbInit().makeDbUpdate(query);
        System.out.println(result);
    }
}
