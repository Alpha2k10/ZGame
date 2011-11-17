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
public class NewUserMapNumber {
    public void newUserMapNumber(int mapId,String name,int mapNumber){
        String query="";
        query+="INSERT INTO mapNumber (mapId,name,number) VALUES (";
        query+=""+mapId+",";
        query+="'"+name+"',";
        query+=""+mapNumber+");";
        System.out.println(query);
        int result = Objekte.getDbInit().makeDbUpdate(query);
        System.out.println(result);
    }
}
